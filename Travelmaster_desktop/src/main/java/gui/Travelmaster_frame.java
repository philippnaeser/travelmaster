package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import start.Main_and_settings;

/*
 * GUI des Travelmasters, Kategorien und Saetze werden in Listen ausgegeben, die klickbar sind.
 * Bei Klick werden entweder die einzelnen Saetze der Kategorien oder die Uebersetzung abgerufen.
 */
@SuppressWarnings("serial")
public class Travelmaster_frame extends JFrame {
	final DefaultListModel<String> cat;
	final DefaultListModel<String> sentence;
	final JList<String> categories;
	final JList<String> sentences;
	JLabel translation;
	private Main_and_settings settings;
	private int selectedcat;
	private int selectedsentence;
	
	public Travelmaster_frame(Main_and_settings settings){
		
		this.settings = settings;
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 600;
		int frameHeight = 480;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);
		JLabel titel = new JLabel();
		titel.setBounds(235, 16, 190, 32);
		titel.setText("Travelmaster");
		titel.setFont(new Font("MS Sans Serif", Font.PLAIN, 23));
		add(titel);
		cat = new DefaultListModel<String>();
		categories = new JList<String>(cat);
		JScrollPane catpane = new JScrollPane(categories);
		catpane.setBounds(10, 65, 150, 275);
		selectedcat = 0;
		categories.addListSelectionListener(new ListSelectionListener(){

			public void valueChanged(ListSelectionEvent arg0) {
				if (selectedcat == 0){
					String tmp = categories.getSelectedValue();
					opencategorie(tmp);
					selectedcat = 1;
				} else {
					selectedcat = 0;
					// Um zu verhindern, dass zwei mal Event ausgelöst wird (bei Klicken und bei loslassen)
				}
			}	
		});
		add(catpane);
		getCategories();
		
		selectedsentence = 0;
		sentence = new DefaultListModel<String>();
		sentences = new JList<String>(sentence);
		JScrollPane senpane = new JScrollPane(sentences);
		senpane.setBounds(170, 65, 400, 275);
		sentences.addListSelectionListener(new ListSelectionListener(){

			public void valueChanged(ListSelectionEvent arg0) {
				if (selectedsentence == 0){
					String tmp = sentences.getSelectedValue();
					translate(tmp);
					selectedsentence = 1;
				}	else {
					selectedsentence = 0;
					// Um zu verhindern, dass zwei mal Event ausgelöst wird (bei Klicken und bei loslassen)
				}
			}
			
		});
		add(senpane);
		
		JLabel label = new JLabel();
		label.setBounds(20, 400, 70, 30);
		label.setText("Translation:");
		add(label);
		
		translation = new JLabel();
		translation.setBounds(90, 400, 500, 30);
		translation.setText("");
		add(translation);
		
		setResizable(false);
		setVisible(true);
	}
	
	private void getCategories(){
		String[] tmp = settings.getCategories();
		for (int i = 0; i <tmp.length; i++ ){
			cat.addElement(tmp[i]);
		}
	}
	
	private void opencategorie(String categorie){
		sentence.clear();
		String [] tmp = settings.getSentences(categorie);
		for (int i= 0; i<tmp.length; i++){
			sentence.addElement(tmp[i]);
		}
	}
	
	private void translate (String sentence){
		String result = settings.translate(sentence);
		translation.setText(result);
	}
}
