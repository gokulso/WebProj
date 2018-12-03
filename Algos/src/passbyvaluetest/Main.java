package passbyvaluetest;

public class Main {
	public static void main(String[] args) {
		Foo f = new Foo(10);
		int i = 1;
		changeReference(f,i); // It won't change the reference!
		System.out.println("Before changing and modifying ref " + f.getAttribute() + "  :: "+ i);
		modifyReference(f); // It will change the object that the reference
							// variable "f" refers to!
		
		System.out.println("After changing and modifying ref " + f.getAttribute());
	}

	public static void changeReference(Foo a, int x) {
		Foo b = new Foo(20);
		a = b;
		
		x = 2;
	}

	public static void modifyReference(Foo c) {
		c.setAttribute(25);
	}
	
	
}