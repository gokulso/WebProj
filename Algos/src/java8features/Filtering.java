package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		
		Stream<String> stream = list.stream().filter( e ->  e.contains("O"));
		
		stream.forEach(o-> System.out.println(o));

	}
	
	
}
