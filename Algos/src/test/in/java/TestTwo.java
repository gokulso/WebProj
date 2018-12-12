package test.in.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTwo {

	public static void main(String[] args) {
	
     List<Integer> integer = new MyList<>();
   
     
     integer.add(100);
     integer.add(200);
     integer.add(300);
     integer.add(400);
   
     
     System.out.println(" before" +integer);
     
     for (int i = 0; i < integer.size(); i++){
         if(i == 3)
    	 integer.remove(i);
     }
     
     
     System.out.println(" After" +integer);
		
		
	}
	
	
	

}
