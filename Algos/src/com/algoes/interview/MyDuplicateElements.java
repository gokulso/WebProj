package com.algoes.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyDuplicateElements {
 
    public static int[] removeDuplicates(int[] input){
         
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
     
    public static void main(String a[]){
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = removeDuplicates(input1);
        for(int i:output){
           // System.out.print(i+" ");
        }
        
     // Get the ArrayList with duplicate values 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        
        List<Integer> newList = removeDuplicatesFromArraylist(list);
        
        newList.forEach(o->System.out.print(" "  +o));
        
    }

	private static List<Integer> removeDuplicatesFromArraylist(ArrayList<Integer> list) {
		
		List<Integer> newlist = new ArrayList<>();
		
		List<Integer> duplist = new ArrayList<>();
		
		for(Integer i : list) {
			
			if(!newlist.contains(i)) {
				newlist.add(i);
			} else {
				duplist.add(i);
			}
		}
		
		
		return newlist;
	}
}