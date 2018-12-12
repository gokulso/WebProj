package testone.collections.TreeSetTest;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	
	
	public static void main(String[] arg) {

		/*SortedSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(11);
		ts.add(9);
		ts.add(3);
		ts.add(15);

		System.out.println("First data: " + ts.first());

		// To get the largest value from set
		System.out.println("Last data: " + ts.last());
		System.out.println("Set size: " + ts.size());

		Iterator<Integer> itr = ts.iterator();
		System.out.print("Tree set data: ");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");*/
		Map<String,Integer> map = new Hashtable<>();
		
		SortedSet<String> ts = new TreeSet<>();
		ts.add("John");
		ts.add("Marry");
		ts.add("Zen");
		ts.add("Ann");
		ts.add("Ben");

		System.out.println("First data: " + ts.first());

		// To get the largest value from set
		System.out.println("Last data: " + ts.last());
		System.out.println("Set size: " + ts.size());

		Iterator<String> itr = ts.iterator();
		System.out.print("Tree set data: ");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			
			
			
			
			

		}

	}
	

}
