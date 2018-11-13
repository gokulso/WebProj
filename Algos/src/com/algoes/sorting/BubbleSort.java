package com.algoes.sorting;

import java.util.List;

/**
 * Time complexity is O(n2)
 * 
 *   = T(n) =(n-1)*(n-1)*C
 *   = Cn2*2Cn +1
 *   = O(n2)
 * 
 */

public class BubbleSort {
	
	

	public static void main(String[] args) {
		int[] input = {100,20,15,30,5,75,40};
		
		sortAarrays(input);
	}

	private static void sortAarrays(int[] input) {
		int n = input.length;
		int k;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - 1; j++) {
				k = j + 1;
				if (input[j] > input[k]) {
					swapNumbers(j, k, input);
				}

			}
			printNumber(input);
		}

	}

	private static void swapNumbers(int i, int k, int[] input) {
		
		int temp;
		temp = input[i];
 		input[i] = input[k];
		input[k] = temp;
	}
	
	
	private static void printNumber(int[] input) {
		for(int i =0; i<input.length;i++){
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	

}
