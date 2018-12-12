package thread.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
	/*	MyRunnable t = new MyRunnable();
	   
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		//t1.setName("SaparateThread");
		//t1.start();
		
		t2.start();
		t.run(" str arg");
		t2.getName();
		*/
		
		//Executor executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newCachedThreadPool();
		//Executor executor = Executors.newCachedThreadPool();
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));	
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));	
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		executor.execute(()->System.out.println("Helllo " + Thread.currentThread().getName()));
		
		int cores = Runtime.getRuntime().availableProcessors();
		
		System.out.println("No Of Cores  " + cores);
		
		System.out.println(executor.isTerminated());
		
		executor.shutdown();
		Thread.sleep(1000);
		System.out.println(executor.isTerminated());
	}
	
	
	
	

}
