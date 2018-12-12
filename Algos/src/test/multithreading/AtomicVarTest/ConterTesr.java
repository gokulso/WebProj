package test.multithreading.AtomicVarTest;

public class ConterTesr {

	public static void main(String[] args) throws InterruptedException {
	
		Counter counter = new Counter();
		
		IncrementerThread thread1 = new IncrementerThread(counter);
		IncrementerThread thread2 = new IncrementerThread(counter);
		
		thread1.start();    // thread 1 increments the count by 10000
		thread2.start();    // thread 2 increments the count by 10000
		
		thread1.join();    // wait for thread 1 to finish
		thread2.join();    // wait for thread 2 to finish

		
		System.out.println(counter.getValue());
	}

}
