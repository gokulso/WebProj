package inhertancetest;

public class ClassB extends ClassA {
	
	
	private int a=20;
	
     public void someMethod(){
		System.out.println(" In Class B someMethod");
	}

	public int getAA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


}
