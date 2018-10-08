
package InnerClass;

import InnerClass.Outer.Ntets;

public class StaticTest {

	static class B2 {
		static void goB2() {
			System.out.println("hi  from B2");
		}
	}
	public static void main(String[] args) {
	Outer.Ntets n = new Outer.Ntets(); // both class names
	n.go();
	B2.goB2();     // access the enclosed class
	
	}
	
	
	

}
