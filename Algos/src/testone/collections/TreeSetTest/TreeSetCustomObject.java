package testone.collections.TreeSetTest;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCustomObject {

	public static void main(String[] args) {
		
		//SortedSet<Person> ts = new TreeSet<>();
		NewComparator compa = new NewComparator();
		SortedSet<Person> ts = new TreeSet<>(compa);
		
		ts.add(new Person(18,"Mary"));
		ts.add(new Person(22,"john"));
		ts.add(new Person(32,"micheal"));
		ts.add(new Person(28,"Ben"));
		ts.add(new Person(22,"May"));
		
		Iterator<Person> itr = ts.iterator();
		while(itr.hasNext())
			System.out.println(itr.next() + " ");
		
		System.out.println("TreeSet Size :" + ts.size());
		
		
		
		
		
		

	}

}
