package statictest;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Test implements Serializable {
	
	
	public static void main(String[] args) {
		
		List<String> l = new LinkedList<>();
		
		
		Foo f = new Bar();
		f.instanceMethod();
		Foo.classMethod();
		
		System.out.println("Integer Min = " + Integer.MIN_VALUE);
		System.out.println("Integer Min = " + Integer.MAX_VALUE);

	}

}
