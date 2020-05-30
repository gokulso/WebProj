package casting.test;

import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		
		Iterator<Integer> iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
