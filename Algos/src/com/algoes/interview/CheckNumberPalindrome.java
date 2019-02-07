package com.algoes.interview;

import java.util.Scanner;

public class CheckNumberPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        String str = isPalindrome(palindrome)? " is a palindrome" :" is not a palindrome";
        
        System.out.println("Number : " + palindrome + str);

	}

	private static boolean  isPalindrome(int number) {

        int palindrome = number;
        
        int reverse=0;
        
        while(palindrome != 0) {
        	int remainder = palindrome % 10;
        	
        	reverse = reverse * 10 + remainder;
        	
        	palindrome = palindrome /10;
        }
        
        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }

		
		return false;
		
	}

}
