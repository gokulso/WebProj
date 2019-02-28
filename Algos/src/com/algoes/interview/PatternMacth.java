package com.algoes.interview;

import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

public class PatternMacth {

	public static void main(String[] args) {

		String pattern = "{(())()}";
		
		String toMatch = "{(())()}";

		System.out.println(matchPattern(pattern, toMatch));

	}

	private static boolean matchPattern(String pattern, String toMactch) {
		
		char[] arr = pattern.toCharArray();
		
		char[] toArr = toMactch.toCharArray();
		
		if(arr.length == toArr.length && ((arr[0] == toArr[0])&&(arr[arr.length-1] == toArr[toArr.length-1]))) {
			
		   // Stack<Character> stack1 = new Stack<>();
		   // Stack<Character> stack2 = new Stack<>();
		    
		    Deque<Character> q1 = new LinkedList<>();
		    Deque<Character> q2 = new LinkedList<>();
		    
		  
		    
		    
			for (Character c : arr) {
				q1.push(c);
			}
			
			for(Character c : toArr) {
				q2.push(c);
			}
			
			for(int i=0;i < arr.length;i++) {
				if(q1.pop().equals(q2.pop())) {
					System.out.println(q1.size() + ":" + q2.size());
				}else {
					return false;
				}
			}
			
			
			return true;
		}
		
	
		
		
		
		return false;

	}

}
