package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestLegacy {

	public static void main(String[] args) {
		
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(20);
		
		
	    Inserter in = new Inserter();
	    in.inser(myList);
	    
	    for (Integer i : myList){
	    	System.out.println(i);
	    }

	}

}
