package com.algoes.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompaireArrayList {

	public static void main(String[] args) {
	
		
		List<String> list1 = new ArrayList<>();
		list1.add("James");
		list1.add("Martin");
		list1.add("Jonh");
		list1.add("Merry");
		list1.add("Nick");
		
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("Avinash");
		list2.add("Pankaj");
		list2.add("Narayan");
		list2.add("Merry");
		list2.add("Nick");
		

		/*list1.removeAll(list2);
		
		System.out.println("Removing Duplicates" + list1);*/
		
	
		
		list1.retainAll(list2);
		System.out.println("Fetching Duplicates" + list1);
		
		
		 int[] arr1 = {4,7,3,9,2};
	     int[] arr2 = {3,2,12,9,40,32,4};
	     
	     
	     for(int i=0;i<arr1.length;i++) {
	    	 for(int j=0;j<arr2.length;j++) {
	    		 if(arr1[i] == arr2[j] ) {
	    			 System.out.print(arr1[i]);
	    		 }
	    	 }
	     }
	     
	     System.out.println("---------------------");
	     
	        int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	
		
	}

}
