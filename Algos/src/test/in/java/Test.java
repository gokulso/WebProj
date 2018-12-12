
package test.in.java;

/*		List<Integer> listA = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());

List<Integer> listB = Arrays.stream(b).boxed().sorted().collect(Collectors.toList());

List<Integer> listC = Arrays.stream(c).boxed().sorted().collect(Collectors.toList());

List<Integer> listD = Arrays.stream(d).boxed().sorted().collect(Collectors.toList());*/

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public final class Test {

	

	public static void main(String[] args) {
		int[] a={12,3,8};
		int[] b={0,3,14};
		int[] c={4,6,14};
		int[] d={8,12,6};
		
	System.out.println(someTest(a, b, c, d));
	 

	}
	

	
	
	public static int someTest(int[] a, int[] b, int[] c, int[] d) {

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);

		int A = findDiff(a);
/*		int B = findDiff(b);
		int C = findDiff(c);
		int D = findDiff(d);*/

	
		
		

		return 0;

	}


	private static int findDiff(int[] arr) {

		int max_diff = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		return max_diff;
	}
}
