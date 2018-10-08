package inhertancetest;

public class ClassA {
	
	private int a=10;
	
	public ClassA(){
		System.out.println("in super");
	}
	
	public void someMethod(){
		System.out.println(" In Class A someMethod");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
