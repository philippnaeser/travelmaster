package start;

import java.util.ArrayList;
import java.util.HashMap;

import content.Content_categories;
import content.Content_verwaltung;
import gui.ChooseLanguage;
import gui.Travelmaster_frame;

/*
 * Startet Travelmaster und kuemmert sich um die Speicherung der Informationen, welche Sprachen
 * vom Nutzer gewaehlt wurden.
 * Gleichzeitig stellt diese Klasse die Schnittstelle zwischen GUI und content dar.
 */
public class Main_and_settings {

	private String language1;
	@SuppressWarnings("unused")
	private String language2;
	private Content_verwaltung verw;
	private Content_categories categories;
	
	public Main_and_settings(){
		verw = new Content_verwaltung();
		categories = new Content_categories();
	}
	
	public void setlanguage1 (String l){
		this.language1= l;
		verw.setMap1(l);	
	}
	
	public void setlanguage2 (String l){
		this.language2= l;
		verw.setMap2(l);		
	}
	
	public String[] getCategories(){
		return categories.getCategories(language1);
	}
	
	public String[] getSentences(String categorie){
		HashMap<Integer, String> tmp = verw.getMap1();
		ArrayList<Integer> number = categories.getNumbers(language1, categorie);
		String[] result = new String[number.size()];
		for (int i = 0; i<number.size(); i++){
			result[i] = tmp.get(number.get(i));
		}
		return result;
	}
	
	public String translate (String sentence){
		String tmp = verw.translate(sentence);
		if (tmp == null){
			return "Sentence not found";
		}else {
			return tmp;
		}
	}
	

	public static void main(String[] args) {
		Main_and_settings programm = new Main_and_settings();
		new ChooseLanguage(programm);
		new Travelmaster_frame(programm);		
		
		/*
		System.out.println(programm.translate("Ich/Wir habe/n einen Tisch für 2, 3, 4, Personen auf den Namen \"...\" bestellt."));
		programm.setlanguage2("french");
		System.out.println(programm.translate("Ich/Wir möchte/n mehr Brot bitte."));
		
		programm.setlanguage1("french");
		programm.setlanguage2("spanish");
		System.out.println(programm.translate("Je/Nous voudrais/voudrons plus du pain s'il vous plaît."));

		*/
	}

}

