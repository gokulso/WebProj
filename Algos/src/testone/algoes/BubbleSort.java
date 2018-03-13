package testone.algoes;


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
		int[] input = { 4, 2, 9, 6};
		
		sortAarrays(input);
	}

	private static void sortAarrays(int[] input) {
		int n = input.length;
		int k;
		for (int m = n; m > 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (input[i] > input[k]) {
					swapNumbers(i, k, input);
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
