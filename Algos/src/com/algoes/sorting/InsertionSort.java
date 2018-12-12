package com.algoes.sorting;

public class InsertionSort {

	public static void main(String[] args) {

               int[] arr = {10,80,20,90,11,22,23,30};
               
               insertionSort(arr);
               
            printOutput(arr);
      
	}

	private static void printOutput(int[] input) {
		for(int i = 0;i < input.length; i++){
			System.out.print(input[i] + " ");
		}
		
	}

	private static void insertionSort(int[] arr) {
		int length = arr.length;

		if (arr == null || length < 2)
			return;
		
		for(int i = 1; i < length ; i++){
			int temp = arr[i];
			                 
			int j = i-1;                         // Comparison starts from one step back of element on which we are working that is i.
			
			while(j >= 0 && arr[j] > temp){                              //Compare elements till we not found element higher than temp or all element are compared.
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}

	}

}
