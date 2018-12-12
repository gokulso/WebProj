package testone.collections;

import java.util.Arrays;

public class SearchObjArray {

	public static void main(String[] args) {
	
		String[] sa = {"one","two","three","four"};
		
		Arrays.sort(sa);
		for(String s : sa)
		System.out.print(" "+s);
		
		System.out.println(" \none = " +Arrays.binarySearch(sa, "one"));
	}

}
