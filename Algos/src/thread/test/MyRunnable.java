package thread.test;

public class MyRunnable implements Runnable {


	@Override
	public void run() {
		System.out.println("Running from MyRunnable: " + "thread Name :" + Thread.currentThread().getName());
		
	}
	
	
	public void run(String str) {
		System.out.println("Running from MyRunnable: " + "thread Name :" + Thread.currentThread().getName() + str);
		
	}
	
	
	
	

}
