package inhertancetest;

public class ClassA {
	
	public int a=10;
	
	public ClassA(){
		System.out.println("in super");
	}
	
	/*public void someMethod(){
		System.out.println(" In Class A someMethod");
	}*/

	public int getA() {
		System.out.println(" In Class A getA");
		return a;
	}

	/*public void setA(int a) {
		this.a = a;
	}*/

}
