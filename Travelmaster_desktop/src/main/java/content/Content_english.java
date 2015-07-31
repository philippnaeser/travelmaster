package content;

import java.util.HashMap;

/*
 * Content für Englisch, fuellt die Inhalte in eine Hashmap und gibt diese bei Bedarf aus.
 */
public class Content_english {
HashMap<Integer, String> map;
	
	public Content_english(){
		map = new HashMap<Integer, String>();
		createmap();
	}
	
	public HashMap<Integer, String> getMap(){
		return map;
	}
	
	private void createmap(){
		map.put(1, "I/We would like to reserve a table for two/three/four persons.");
		map.put(2, "I/We have ordered a table for two/three/four persons on the name \"…\".");
		map.put(3, "Do you have a free table?");
		map.put(4, "The menu please.");
		map.put(5, "What do you recommend?");
		map.put(6, "I/We would like to order.");
		map.put(7, "I/We would like more bread please.");
		map.put(8, "Would You give me/us salt and pepper, please?");
		map.put(9, "I/We need one more plate, a spoon, a fork and a knife please.");
		map.put(10, "Could You bring us a bottle of water, please?");
		map.put(11, "Where is the toilet?");
		map.put(12, "The bill please.");
		map.put(13, "The food/meal was very tasty.");
		map.put(14, "The food/meal was ok.");
		map.put(15, "I am/We are sorry but the food/meal did not taste good at all.");
		map.put(16, "Keep the change.");
		map.put(17, "I/We booked a room on the name “…“.");
		map.put(18, "I/We would like to book a single room/double room.");
		map.put(19, "Could You give me/us an overall view of all the activities of the hotel, please?");
		map.put(20, "Could You order me/us a taxi to the city centre, please?");
		map.put(21, "I/We lost mine/our room card. Could You maybe give us an other one, please?");
		map.put(22, "I/We would like to take a room for an additional night/for more two/three nights.");
		map.put(23, "Left");
		map.put(24, "Right");
		map.put(25, "Straight ahead");
		map.put(26, "The second left/right");
		map.put(27, "I/We are looking for the train/bus station.");
		map.put(28, "Which is the best way to the beach?");
		map.put(29, "Two fares/tickets please.");
		map.put(30, "Bus");
		map.put(31, "Taxi");
		map.put(32, "Tram");
		map.put(33, "Where do I/We find […]?");
		map.put(34, "Two fares/tickets for […] please.");
		map.put(35, "Which clubs are popular here?");
		map.put(36, "Where can we party the most?");
		map.put(37, "Where can I/We find here nice people?");
		map.put(38, "Where do I/We find a good bar?");
		map.put(39, "Beach");
		map.put(40, "Sea");
		map.put(41, "Lounger");
		map.put(42, "Sunshade");
		map.put(43, "I/We would like to rent two loungers.");
		map.put(44, "I/We would like to attend a surf course");
		map.put(45, "Help!");
		map.put(46, "Lifeguard");
		map.put(47, "I/We need a doctor.");
		map.put(48, "Please call an ambulance.");
		map.put(49, "I am allergic to […].");
		map.put(50, "Where do I/We find a pharmacy?");
		map.put(51, "Please call the police.");
		map.put(52, "I was/We were robbed.");
		map.put(53, "I/we want to rent a car, please.");
		map.put(54, "Could we have a look again at all the damages on the car, please? ");
		map.put(55, "car which runs on petrol");
		map.put(56, "car which runs on diesel");
		map.put(57, "Hello, I am [...].");
		map.put(58, "Hello, my name is [...].");
		map.put(59, "Nice to meet you.");
		map.put(60, "I am [...] years old.");
		map.put(61, "I am/ We are from Germany.");
		map.put(62, "How are you?");
		map.put(63, "I am/ We are fine.");
		map.put(64, "Very nice weather.");
		map.put(65, "Do you have fire?");
		map.put(66, "World Cup");
		map.put(67, "Europe Cup");
		map.put(68, "Olympic Games");
		map.put(69, "Tennis");
		map.put(70, "Golf");
		map.put(71, "Basketball");
		map.put(72, "Handball");
		map.put(73, "Football/Soccer");
		map.put(74, "Stadium");
		map.put(75, "I am a big fan of [...].");
		map.put(76, "My favorite team ist [...]");
		map.put(77, "hunger");
		map.put(78, "thirst");
		map.put(79, "filling station");
		map.put(80, "money");
		map.put(81, "Thank you");
		map.put(82, "Please");
		map.put(83, "Hello");
		map.put(84, "Good Bye");
		map.put(85, "Good morning");
		map.put(86, "Good afternoon");
		map.put(87, "Good evening");
		map.put(88, "Good night");
		map.put(89, "restaurant");
		map.put(90, "hotel");
		map.put(91, "airport");
		map.put(92, "transport");
		map.put(93, "supermarket");
		map.put(94, "cigarrette");
		map.put(95, "lighter");
		map.put(96, "beer");
		map.put(97, "wine");
		map.put(98, "water");
		map.put(99, "ice/ice cream");
		
	}

}