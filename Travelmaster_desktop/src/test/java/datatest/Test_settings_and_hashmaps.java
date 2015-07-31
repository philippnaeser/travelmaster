package datatest;

import start.Main_and_settings;

public class Test_settings_and_hashmaps {

	public static void main(String[] args) {
		Main_and_settings programm = new Main_and_settings();
		programm.setlanguage1("german");
		programm.setlanguage2("portuguese");
		
		String test1 = programm.translate("Ich/Wir habe/n einen Tisch für 2, 3, 4, Personen auf den Namen \"...\" bestellt.");
		programm.setlanguage2("french");
		String test2 = programm.translate("Ich/Wir möchte/n mehr Brot bitte.");
		
		programm.setlanguage1("french");
		programm.setlanguage2("spanish");
		String test3 = programm.translate("Je/Nous voudrais/voudrons plus du pain s'il vous plaît.");
		
		if (test1.equals("Eu reservei/Nós reservamos uma mesa para duas/três/quatro pessoas no nome […].")){
			System.out.println("Translation German to Portuguese successful");
			System.out.println(test1);
		}
		if (test2.equals("Je/Nous voudrais/voudrons plus du pain s'il vous plaît.")){
			System.out.println("Translation German to French successful");
			System.out.println(test2);
		}
		if (test3.equals("Puede traerme/traernos más pan por favor?")){
			System.out.println("Translation French to Spanish successful");
			System.out.println(test3);
		}
	}

}
