package start;

import content.Content_verwaltung;

public class Main_and_settings {
	@SuppressWarnings("unused")
	private String language1;
	@SuppressWarnings("unused")
	private String language2;
	private Content_verwaltung verw;
	
	public Main_and_settings(){
		verw = new Content_verwaltung();
	}
	
	public void setlanguage1 (String l){
		this.language1= l;
		verw.setMap1(l);	
	}
	
	public void setlanguage2 (String l){
		this.language2= l;
		verw.setMap2(l);		
	}
	
	public String translate (String sentence){
		String tmp = verw.translate(sentence);
		return tmp;
	}
	

	public static void main(String[] args) {
		Main_and_settings programm = new Main_and_settings();
		programm.setlanguage1("german");
		programm.setlanguage2("portuguese");
		
		System.out.println(programm.translate("Ich/Wir habe/n einen Tisch für 2, 3, 4, Personen auf den Namen \"...\" bestellt."));
		programm.setlanguage2("french");
		System.out.println(programm.translate("Ich/Wir möchte/n mehr Brot bitte."));
		
		programm.setlanguage1("french");
		programm.setlanguage2("spanish");
		System.out.println(programm.translate("Je/Nous voudrais/voudrons plus du pain s'il vous plaît."));

		
	}

}

