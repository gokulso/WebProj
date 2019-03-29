package java8streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamtest {

	// Driver code
	public static void main(String[] args) {
		// Creating an IntStream
		List<String> strList = new ArrayList<>();
		strList.add("One"); strList.add("Two"); strList.add("Three");
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);numList.add(2);numList.add(3);
		
		Map<String, Integer> stream = IntStream.range(0, strList.size()).boxed().collect(Collectors.toMap(strList::get, numList ::get));
		//IntStream stream = IntStream.rangeClosed(6, 10);

		// Displaying the elements in range
		// including the lower bound but
		// excluding the upper bound
		stream.forEach((k,v)-> System.out.println("key : " + k +" Value : " + v));
	}

}
