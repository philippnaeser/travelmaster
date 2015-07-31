package gui;

import javax.swing.JOptionPane;

import start.Main_and_settings;

/*
 * Diese Klasse macht die Abfragen zu Beginn des Programms, von welcher Sprache sie ausgehen und
 * in welche Sprache sie uebersetzen moechten.
 */
public class ChooseLanguage {
	
	public ChooseLanguage(Main_and_settings settings){
		String[] languages = new String[5];
		languages[0] = "German";
		languages[1] = "English";
		languages[2] = "Spanish";
		languages[3] = "Portuguese";
		languages[4] = "French";
		String language1 = (String) JOptionPane.showInputDialog(null, null, "Your language:", 3, null, languages, "German");
		settings.setlanguage1(language1.toLowerCase());
		String language2 = (String) JOptionPane.showInputDialog(null, null, "Target language::", 3, null, languages, "German");
		settings.setlanguage2(language2.toLowerCase());
	}

}
