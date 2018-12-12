package oops;

public class Car extends Engine {
	
	String name;
	private int engine;
	
	
	
	public Car(String name, int engine) {
		super();
		this.name = name;
		this.engine = engine;
	}



	public Car() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEngine() {
		return engine;
	}



	public void setEngine(int engine) {
		this.engine = engine;
	}



	@Override
	void capacity() {
	 System.out.println("Enigne cc is :" + this.engine);
		
	}



	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	
	
	
	
	
/*	public void move(){
		engine.start();
		System.out.println("Car is Moving ");
	}
*/
}
