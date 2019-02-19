package testone.collections.TreeSetTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMerge {
	
	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		 
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(5, "E");
		 
		//map 2
		Map<Integer, String> map2 = new HashMap<>();
		 
		map2.put(1, "G");   //It will replace the value 'A'
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(4, "D");   //A new pair to be added
		 
		//Merge maps
		map1.putAll(map2);
		 
		System.out.println(map1);
		
		
		 map.put("Jayant", 80); 
	        map.put("Abhishek", 90); 
	        map.put("Anushka", 80); 
	        map.put("Amit", 75); 
	        map.put("Danish", 40); 
	        
	        sortbykey();     

	}
	
	
	public static void sortbykey() 
    { 
        // TreeMap to store values of HashMap 
        Map<String, Integer> sorted = new TreeMap<>(); 
  
        // Copy all data from hashMap into TreeMap 
        sorted.putAll(map); 
  
        // Display the TreeMap which is naturally sorted 
        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());         
    } 

}
