package thread.test;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyRunnable t = new MyRunnable();
	   
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		//t1.setName("SaparateThread");
		//t1.start();
		
		t2.start();
		t.run(" str arg");
		t2.getName();
		
		
		
/*		int cores = Runtime.getRuntime().availableProcessors();
		
		System.out.println("No Of Cores  " + cores);*/
		
	}
	
	
	
	

}
