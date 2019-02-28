package MapTest;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {
	/**
	 * @author Gokul Sonawane
	 */
	public static void main(String[] args) {
		
		Object o = new Object();

		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);

		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);

		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		String s = countryCapitalMap.put(russia, "Moscow");
		
		System.out.println("size :- " + countryCapitalMap.size());
		
		System.out.println(" return key :- " + s);
		
		
		Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();// put debug here
																	
		while (countryCapitalIter.hasNext()) {
			Country countryObj = countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
		
		countryCapitalMap.forEach((k,v)-> System.out.println("Key " + k.getName()+ "  Val " + v));
	}

}
