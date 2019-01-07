package collection.remove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicats {

	public static void main(String[] args) {
		int[] arr1 = { 4, 2, 8, 5, 6, 10 };
		int[] arr2 = { 4, 1, 8, 7, 6, 2, 1, 10 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					// System.out.println(arr1[i]);
				}
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}

		//System.out.println(list);
		//findDuplicates(list).forEach((l) -> System.out.println(l));
		
		

		List<Integer> listOne = new ArrayList<>();
		List<Integer> listTwo = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listOne.add(i);
		}
		for (int i = 0; i < 5; i++) {
			listTwo.add(i);
		}
		
		compaireListAndFindDuplicates(listOne,listTwo).forEach(System.out::println);;


	}

	private static List<Integer> compaireListAndFindDuplicates(List<Integer> listOne, List<Integer> listTwo) {

		List<Integer> dupli = new ArrayList<>();
		for (Integer one : listOne) {
			if (listTwo.contains(one))
				dupli.add(one);
		}

		return dupli;
	}

	private static Set<Integer> findDuplicates(List<Integer> list) {
		Set<Integer> original = new HashSet<>();
		Set<Integer> dups = new HashSet<>();
		for(Integer inti : list){
			if(!original.add(inti))
				dups.add(inti);
		}
		
		return dups;
	}
		// TODO Auto-generated method stub
		
	}
