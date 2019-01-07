package com.algoes.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	 
		BinarySearch bs = new BinarySearch();
		int[] arr  = {1, 3, 4, 10,90,80,110,120,130,2,140,150,40,50,60,70,100,};
		int x = 140;
		Arrays.sort(arr);
		int result = bs.binarySearch(arr, x);
		int result1 = bs.linearSearch(arr, x);
		String fr = (result == -1)?"Element not present":"Element found at index " + result;
        System.out.println(fr);
        
        String fr1 = (result1 == -1)?"Element not present":"Element found at index " + result1;
        System.out.println(fr1);
	}



	private int binarySearch(int[] arr, int x) {

		int l = 0, r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - 1) / 2;

			// Check if x is present at mid
			if (arr[m] == x) {

				return m;

				// If x greater, ignore left half
			} else if (arr[m] < x) {
				l = m + 1;

				// If x is smaller, ignore right half
			} else {
				r = m - 1;
			}
		}

		return -1;
	}
	
	private int linearSearch(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {

				return i;
			}
		}

		return -1;
	}
}
