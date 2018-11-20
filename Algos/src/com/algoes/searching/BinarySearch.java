package com.algoes.searching;

public class BinarySearch {

	public static void main(String[] args) {
	 
		BinarySearch bs = new BinarySearch();
		int[] arr  = {2, 3, 4, 10, 40,50,60,70,80,90,100,110,120,130,140,150,};
		int x = 140;
		int result = bs.binarySearch(arr, x);
		int result1 = bs.linearSearch(arr, x);
		String fr = (result == -1)?"Element not present":"Element found at index " + result;
        System.out.println(fr);
        
        String fr1 = (result1 == -1)?"Element not present":"Element found at index " + result1;
        System.out.println(fr1);
	}



	private int binarySearch(int[] arr, int x) {

		long startTime = System.nanoTime();
		//long middleTime = 0;

		int l = 0, r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - 1) / 2;

			// Check if x is present at mid
			if (arr[m] == x){
				long middleTime = System.nanoTime();
				long totaltime = startTime - middleTime;
				System.out.println("time taken for Binary search " + totaltime);
				return m;

			// If x greater, ignore left half
			} else if (arr[m] < x){
				l = m + 1;

			// If x is smaller, ignore right half
			}else{
				r = m - 1;
			}	
		}

		long EndtTime = System.nanoTime();

		
		return -1;
	}
	
	private int linearSearch(int[] arr, int x) {
		long startTime = System.nanoTime();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x){
				long middleTime = System.nanoTime();
				long totaltime = startTime - middleTime;
				System.out.println("time taken for Linear search " + totaltime);
				return i;
			}		
		}

		long EndtTime = System.nanoTime();
		long totaltime = startTime - EndtTime;
		System.out.println("time taken for Linear search " + totaltime);
		return -1;
	}
}
