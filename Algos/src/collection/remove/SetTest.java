package collection.remove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
        // Creating an empty HashSet 
        Set<String> set = new HashSet<>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("Geeks"); 
        set.add("4"); 
        set.add("Geeks"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
  
        // Creating an iterator 
        Iterator<String> value = set.iterator(); 
  
        // Displaying the values after iterating through the set 
     /*   System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
            if(set.contains("4"))
            value.remove();
        } 
        System.out.println("HashSet after : " + set); */
        
        for(int i =0 ; i <= set.size();i++){
        	if(i==2)
        	set.add("5"); 
        	if(set.contains("4"));
        	set.remove("4");
        }
        
        System.out.println("HashSet after : "); 
        set.forEach(System.out::println);
    }

}
