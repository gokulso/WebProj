package oops;

public abstract class Engine {
	
	int cc;
	String enginetype;
	
	public  static int MAXSPEED = 60;
	
	public Engine(int cc, String enginetype) {
		super();
		this.cc = cc;
		this.enginetype = enginetype;
	}
	
	Engine(){System.out.println("Base Constructor Called");}
	
	public void start(){
	System.out.println("engine has started ");
	
	
	}
	
	abstract void capacity();
	

}
