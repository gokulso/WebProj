package com.algoes.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindRepeatedChar {

	public static void main(String[] args) {

		String str = "javaisthebest";
		
		 char arr[]  =  str.toCharArray();
		 
		 Map<Character,Integer > dupMap = new HashMap<>();

		 for (Character ch : arr) {
			 if(dupMap.containsKey(ch)) {
				 dupMap.put(ch, dupMap.get(ch)+1);
			 }else {
				 dupMap.put(ch, 1);
			 }
		 }
		 
		 
		 
		 Set<Character> keys = dupMap.keySet();
		 
            for(Character c : keys) {
            	if(dupMap.get(c)>1) {
            		System.out.println(c + " --> " + dupMap.get(c));
            	}
            }
            
            
            
            List<String> list = Arrays.asList(str.split(""));
            
            Set<String> uniqueWords = new HashSet<>(list);
            for (String chr : uniqueWords) {
            	if(Collections.frequency(list, chr) > 1)
                System.out.println(chr + ": " + Collections.frequency(list, chr));
            }
	}

}
