package datatest;

import start.Main_and_settings;

public class Test_settings_and_hashmaps {

	public static void main(String[] args) {
		Main_and_settings programm = new Main_and_settings();
		programm.setlanguage1("german");
		programm.setlanguage2("portuguese");
		
		String test1 = programm.translate("Ich/Wir habe/n einen Tisch f�r 2, 3, 4, Personen auf den Namen \"...\" bestellt.");
		programm.setlanguage2("french");
		String test2 = programm.translate("Ich/Wir m�chte/n mehr Brot bitte.");
		
		programm.setlanguage1("french");
		programm.setlanguage2("spanish");
		String test3 = programm.translate("Je/Nous voudrais/voudrons plus du pain s'il vous pla�t.");
		
		if (test1.equals("Eu reservei/N�s reservamos uma mesa para duas/tr�s/quatro pessoas no nome [�].")){
			System.out.println("Translation German to Portuguese successful");
			System.out.println(test1);
		}
		if (test2.equals("Je/Nous voudrais/voudrons plus du pain s'il vous pla�t.")){
			System.out.println("Translation German to French successful");
			System.out.println(test2);
		}
		if (test3.equals("Puede traerme/traernos m�s pan por favor?")){
			System.out.println("Translation French to Spanish successful");
			System.out.println(test3);
		}
	}

}
