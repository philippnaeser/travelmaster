package content;

import java.util.HashMap;

public class Content_verwaltung {
	private HashMap<Integer, String> l1;
	private HashMap<Integer, String> l2;

	public Content_verwaltung(){
		
	}
	
	public void setMap1 (String language){
		if (language.equals("german")){
			Content_german tmp = new Content_german();
			l1 = tmp.getMap();
		} else if (language.equals("english")){
			Content_english tmp = new Content_english();
			l1 = tmp.getMap();
		} else if (language.equals("spanish")) {
			Content_spanish tmp = new Content_spanish();
			l1 = tmp.getMap();
		} else if (language.equals("portuguese")) {
			Content_portuguese tmp = new Content_portuguese();
			l1 = tmp.getMap();
		} else if (language.equals("french")) {
			Content_french tmp = new Content_french();
			l1 = tmp.getMap();
		}
	}
	
	public void setMap2 (String language){
		if (language.equals("german")){
			Content_german tmp = new Content_german();
			l2 = tmp.getMap();
		} else if (language.equals("english")){
			Content_english tmp = new Content_english();
			l2 = tmp.getMap();
		} else if (language.equals("spanish")) {
			Content_spanish tmp = new Content_spanish();
			l2 = tmp.getMap();
		} else if (language.equals("portuguese")) {
			Content_portuguese tmp = new Content_portuguese();
			l2 = tmp.getMap();
		} else if (language.equals("french")) {
			Content_french tmp = new Content_french();
			l2 = tmp.getMap();
		}
	}
	
	public String translate(String sentence){
		int key = 0;
		for (int i = 1; i<l1.size(); i++){
			if (l1.get(i).equals(sentence)){
				key = i;
			}
		}
		return l2.get(key);
	}	
}

