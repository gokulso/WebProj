package com.algoes.interview;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {10,45,36,48,86,23,10};
		int temp;
		
		for(int i=0; i < arr.length; i++) {
			
			for(int j=i; j<  arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					
					temp= arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
		}
		
		System.out.println("second highest array is " + arr[arr.length - 2]);

	}

}
