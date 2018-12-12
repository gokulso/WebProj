package test.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class PersonTest {

	public static void main(String[] args) {
		
		
	Map<String, String> map = new HashMap<>();
	

       Person p1 = new Person("Sam", 31);
       Person p2 = new Person("Sam", 31);
       
       System.out.println(p1 == p2);
       
       System.out.println(p1.equals(p2));
       
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());


	}

}
