
package inputoutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InputTest {

	public static void main(String[] args) {
		
	
		
		DuplicateCharsInString ds =  new DuplicateCharsInString();
		
		ds.findDuplicates("javaaaistheeeeebestt");
		
		List<Integer> list = new ArrayList<>();
		
		//list.stream().close();
		
		list.add(15);
		list.add(10);
		list.add(25);
		list.add(35);
		list.add(55);
		
		Stream<String> streamEmpty = Stream.generate(()->Double.toString(Math.random()*1000)).limit(10);
		
		streamEmpty.forEach((p)->System.out.println(p));

	}

}
