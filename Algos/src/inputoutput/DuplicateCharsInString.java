package inputoutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	
	public void findDuplicates(String str){
		
		
		
		char[] input = str.toCharArray();
		
		Map<Character,Integer> dupMap = new HashMap<>();
		
		
		
		for(Character c : input){
			if(dupMap.containsKey(c)){
				dupMap.put(c, dupMap.get(c)+1);
			}else{
				dupMap.put(c, 1);
			}
		}
		 System.out.println("Initial Mappings are: " + dupMap);
		
		Set<Character> keys = dupMap.keySet();
		
		for(Character c : keys){
			if(dupMap.get(c)>1)
		     System.out.println("Duplicate Char :- " + c + "  Count -->" + dupMap.get(c));
		}
		
	}

}
