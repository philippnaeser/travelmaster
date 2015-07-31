package content;

import java.util.HashMap;

/*
 * Content für Deutsch, fuellt die Inhalte in eine Hashmap und gibt diese bei Bedarf aus.
 */
public class Content_german {
HashMap<Integer, String> map;
	
	public Content_german(){
		map = new HashMap<Integer, String>();
		createmap();
	}
	
	public HashMap<Integer, String> getMap(){
		return map;
	}
	
	private void createmap(){
		map.put(1, "Ich/Wir möchte/n gerne einen Tisch für 2, 3, 4 Personen reservieren.");
		map.put(2, "Ich/Wir habe/n einen Tisch für 2, 3, 4, Personen auf den Namen \"...\" bestellt.");
		map.put(3, "Haben Sie noch einen Tisch frei?");
		map.put(4, "Die Karte bitte.");
		map.put(5, "Was empfehlen Sie?");
		map.put(6, "Ich/Wir möchte/n gerne bestellen.");
		map.put(7, "Ich/Wir möchte/n mehr Brot bitte.");
		map.put(8, "Können Sie mir/uns Salz und Peffer bringen?");
		map.put(9, "Ich/Wir brauche/n noch einen Teller, einen Löffel, eine Gabel, ein Messer.");
		map.put(10, "Können Sie mir/uns eine Flasche Wasser bringen?");
		map.put(11, "Wo ist die Toilette?");
		map.put(12, "Die Rechnung bitte.");
		map.put(13, "Das Essen war sehr lecker.");
		map.put(14, "Das Essen war in Ordnung.");
		map.put(15, "Es tut mir/uns leid. Aber das Essen hat nicht gut geschmeckt.");
		map.put(16, "Stimmt so.");
		map.put(17, "Ich/Wir habe/n ein Zimmer unter dem Namen \"...\" gebucht.");
		map.put(18, "Ich/Wir möchte/n gerne ein Einzelzimmer/Doppelzimmer buchen.");
		map.put(19, "Können Sie mir/uns bitte eine Übersicht über alle Aktivitäten im Hotel geben?");
		map.put(20, "Können Sie mir/uns bitte ein Taxi in die Innenstadt bestellen?");
		map.put(21, "Ich/Wir habe/n meine/unsere Zimmerkarte verlegt. Können Sie mir/uns eine Ersatzkarte geben?");
		map.put(22, "Ich/Wir möchten gerne für eine, zwei, drei,... weitere Nacht/Nächte ein Zimmer nehmen.");
		map.put(23, "Links");
		map.put(24, "Rechts");
		map.put(25, "Geradeaus");
		map.put(26, "Die zweite links/rechts.");
		map.put(27, "Ich/Wir suche/n die Bahnstation/Busstation.");
		map.put(28, "Wie komme/n ich/wir am besten zum Strand?");
		map.put(29, "Zwei Fahrkarten bitte.");
		map.put(30, "Bus");
		map.put(31, "Taxi ");
		map.put(32, "Straßenbahn");
		map.put(33, "Wo finde/n ich/wir [...]?");
		map.put(34, "Zwei Tickets für [...] bitte.");
		map.put(35, "Welche Clubs sind hier angesagt?");
		map.put(36, "Wo kann man hier gut feiern?");
		map.put(37, "Wo kann man hier nette Leute treffen?");
		map.put(38, "Wo finde/n ich/wir eine gute Bar?");
		map.put(39, "Strand");
		map.put(40, "Meer");
		map.put(41, "Liege");
		map.put(42, "Sonnenschirm");
		map.put(43, "Ich/Wir möchte/n gerne zwei Liegen mieten.");
		map.put(44, "Ich/Wir möchte/n gerne an Ihrem Surfkurs teilnehmen.");
		map.put(45, "Hilfe!");
		map.put(46, "Rettungsschwimmer");
		map.put(47, "Ich/Wir brauche/n einen Arzt.");
		map.put(48, "Rufen Sie bitte einen Krankenwagen.");
		map.put(49, "Ich bin allergisch gegen [...] .");
		map.put(50, "Wo finde/n ich/wir eine Apotheke?");
		map.put(51, "Rufen Sie bitte die Polizei.");
		map.put(52, "Ich/wir wurde/n beraubt.");
		map.put(53, "Ich/Wir möchte/n gerne ein Auto mieten.");
		map.put(54, "Können wir nochmal alle Beschädigungen am Auto begutachten?");
		map.put(55, "Benziner");
		map.put(56, "Diesel");
		map.put(57, "Hallo, ich bin [...].");
		map.put(58, "Hallo, mein Name ist [...].");
		map.put(59, "Freut mich Dich kennenzulernen.");
		map.put(60, "Ich bin [...] Jahre alt.");
		map.put(61, "Ich/Wir komme/n aus Deutschland.");
		map.put(62, "Wie geht es Dir?");
		map.put(63, "Mir/Uns geht es gut.");
		map.put(64, "Sehr schönes Wetter.");
		map.put(65, "Haben Sie Feuer für mich?");
		map.put(66, "Weltmeisterschaft");
		map.put(67, "Europameisterschaft");
		map.put(68, "Olympische Spiele");
		map.put(69, "Tennis");
		map.put(70, "Golf");
		map.put(71, "Basketball");
		map.put(72, "Handball");
		map.put(73, "Fußball");
		map.put(74, "Stadion");
		map.put(75, "Ich bin ein großer Fan von [...].");
		map.put(76, "Meine Lieblingsmannschaft ist [...].");
		map.put(77, "Hunger");
		map.put(78, "Durst");
		map.put(79, "Tankstelle");
		map.put(80, "Geld");
		map.put(81, "Danke");
		map.put(82, "Bitte");
		map.put(83, "Hallo");
		map.put(84, "Auf Wiedersehen.");
		map.put(85, "Guten Morgen");
		map.put(86, "Guten Tag");
		map.put(87, "Guten Abend");
		map.put(88, "Gute Nacht");
		map.put(89, "Restaurant");
		map.put(90, "Hotel");
		map.put(91, "Flughafen");
		map.put(92, "Transport");
		map.put(93, "Supermarkt");
		map.put(94, "Zigaretten");
		map.put(95, "Feuerzeug");
		map.put(96, "Bier");
		map.put(97, "Wein");
		map.put(98, "Wasser");
		map.put(99, "Eis");
	}

}
