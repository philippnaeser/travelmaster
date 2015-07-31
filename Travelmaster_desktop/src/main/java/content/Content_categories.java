package content;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Speichert die Kategorien und die dazugehoerigen Satznummern und gibt diese an Main_and_settings zurueck
 */
public class Content_categories {

	private HashMap<String, ArrayList<Integer>> german;
	private HashMap<String, ArrayList<Integer>> english;
	private HashMap<String, ArrayList<Integer>> spanish;
	private HashMap<String, ArrayList<Integer>> portuguese;
	private HashMap<String, ArrayList<Integer>> french;
	
	public Content_categories(){
		setMapGerman();
		setMapEnglish();
		setMapSpanish();
		setMapPortuguese();
		setMapFrench();
	}
	
	private void setMapGerman(){
		german = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i = 1;
		while (i<17){
			tmp.add(i);
			i++;
		}
		german.put("Restaurant", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<23){
			tmp.add(i);
			i++;
		}
		german.put("Hotel", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<32){
			tmp.add(i);
			i++;
		}
		german.put("Navigation", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<39){
			tmp.add(i);
			i++;
		}
		german.put("Kultur", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<47){
			tmp.add(i);
			i++;
		}
		german.put("Strand", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<53){
			tmp.add(i);
			i++;
		}
		german.put("Notfall", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<57){
			tmp.add(i);
			i++;
		}
		german.put("Autoverleih", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<66){
			tmp.add(i);
			i++;
		}
		german.put("Smalltalk", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<77){
			tmp.add(i);
			i++;
		}
		german.put("Sport", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<100){
			tmp.add(i);
			i++;
		}
		german.put("Nützliche Wörter", tmp);
	}
	
	private void setMapEnglish(){
		english = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i = 1;
		while (i<17){
			tmp.add(i);
			i++;
		}
		english.put("restaurant", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<23){
			tmp.add(i);
			i++;
		}
		english.put("hotel", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<32){
			tmp.add(i);
			i++;
		}
		english.put("navigation", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<39){
			tmp.add(i);
			i++;
		}
		english.put("culture", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<47){
			tmp.add(i);
			i++;
		}
		english.put("beach", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<53){
			tmp.add(i);
			i++;
		}
		english.put("emergency", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<57){
			tmp.add(i);
			i++;
		}
		english.put("car rental", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<66){
			tmp.add(i);
			i++;
		}
		english.put("small talk", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<77){
			tmp.add(i);
			i++;
		}
		english.put("sport", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<100){
			tmp.add(i);
			i++;
		}
		english.put("useful words", tmp);
	}
	
	private void setMapSpanish(){
		spanish = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i = 1;
		while (i<17){
			tmp.add(i);
			i++;
		}
		spanish.put("restaurante", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<23){
			tmp.add(i);
			i++;
		}
		spanish.put("hotel", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<32){
			tmp.add(i);
			i++;
		}
		spanish.put("navegación", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<39){
			tmp.add(i);
			i++;
		}
		spanish.put("cultura", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<47){
			tmp.add(i);
			i++;
		}
		spanish.put("playa", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<53){
			tmp.add(i);
			i++;
		}
		spanish.put("emergencia", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<57){
			tmp.add(i);
			i++;
		}
		spanish.put("alquiler der coches", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<66){
			tmp.add(i);
			i++;
		}
		spanish.put("conversación", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<77){
			tmp.add(i);
			i++;
		}
		spanish.put("deporte", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<100){
			tmp.add(i);
			i++;
		}
		spanish.put("plalabras útiles", tmp);
	}
	
	private void setMapPortuguese(){
		portuguese = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i = 1;
		while (i<17){
			tmp.add(i);
			i++;
		}
		portuguese.put("restaurante", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<23){
			tmp.add(i);
			i++;
		}
		portuguese.put("hotel", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<32){
			tmp.add(i);
			i++;
		}
		portuguese.put("navegação", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<39){
			tmp.add(i);
			i++;
		}
		portuguese.put("cultura", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<47){
			tmp.add(i);
			i++;
		}
		portuguese.put("praia", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<53){
			tmp.add(i);
			i++;
		}
		portuguese.put("emergência", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<57){
			tmp.add(i);
			i++;
		}
		portuguese.put("aluguer de automóveis", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<66){
			tmp.add(i);
			i++;
		}
		portuguese.put("conversa", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<77){
			tmp.add(i);
			i++;
		}
		portuguese.put("desporto", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<100){
			tmp.add(i);
			i++;
		}
		portuguese.put("palavras úteis", tmp);
		
	}
	
	private void setMapFrench(){
		french = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int i = 1;
		while (i<17){
			tmp.add(i);
			i++;
		}
		french.put("restaurant", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<23){
			tmp.add(i);
			i++;
		}
		french.put("hôtel", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<32){
			tmp.add(i);
			i++;
		}
		french.put("navigation", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<39){
			tmp.add(i);
			i++;
		}
		french.put("civilisation", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<47){
			tmp.add(i);
			i++;
		}
		french.put("plage", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<53){
			tmp.add(i);
			i++;
		}
		french.put("urgence", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<57){
			tmp.add(i);
			i++;
		}
		french.put("location de voitures", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<66){
			tmp.add(i);
			i++;
		}
		french.put("conversation", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<77){
			tmp.add(i);
			i++;
		}
		french.put("sport", tmp);
		tmp = new ArrayList<Integer>();
		
		while (i<100){
			tmp.add(i);
			i++;
		}
		french.put("mots utiles", tmp);
	}
	
	public String[] getCategories(String language){
		String [] result = new String[10];
		if (language.equals("german")){
			Object[] tmp =  german.keySet().toArray();
			for (int i = 0; i<tmp.length; i++){
				result[i] = tmp[i].toString();
			}
			return result;
			
		} else if (language.equals("english")){
			Object[] tmp =  english.keySet().toArray();
			for (int i = 0; i<tmp.length; i++){
				result[i] = tmp[i].toString();
			}
			return result;
			
		} else if (language.equals("spanish")){
			Object[] tmp =  spanish.keySet().toArray();
			for (int i = 0; i<tmp.length; i++){
				result[i] = tmp[i].toString();
			}
			return result;
			
		} else if (language.equals("portuguese")){
			Object[] tmp =  portuguese.keySet().toArray();
			for (int i = 0; i<tmp.length; i++){
				result[i] = tmp[i].toString();
			}
			return result;
			
		} else {
			Object[] tmp =  french.keySet().toArray();
			for (int i = 0; i<tmp.length; i++){
				result[i] = tmp[i].toString();
			}
			return result;
		}
	}

	public ArrayList<Integer> getNumbers(String language, String categorie){
		if (language.equals("german")){
			return german.get(categorie);
		} else if (language.equals("english")){
			return english.get(categorie);
		} else if (language.equals("spanish")){
			return spanish.get(categorie);
		} else if (language.equals("portuguese")){
			return portuguese.get(categorie);
		} else {
			return french.get(categorie);
		}
	}
}
