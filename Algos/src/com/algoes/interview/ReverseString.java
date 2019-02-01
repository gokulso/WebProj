package com.algoes.interview;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "javaisthebest";
		
		 char arr[]  =  str.toCharArray();
		 
		 for(int i = arr.length-1;i >=0 ; i--) {
			 System.out.print(arr[i]);
		 }
		 System.out.println();
		 String reverseString = reverseString(str);
         
	        System.out.println("using recorsion:-   " + reverseString);

	}

	private static String reverseString(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		//return reverseString(str.substring(1)) + str.charAt(0);
		return reverseString(str.substring(1));
		
		
	}

}
