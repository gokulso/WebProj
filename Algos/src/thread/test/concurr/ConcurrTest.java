package thread.test.concurr;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrTest {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter(); // the shared object
		IncrementerThread it1 = new IncrementerThread(counter);
		IncrementerThread it2 = new IncrementerThread(counter);
		it1.start(); // thread 1 increments the count by 10000
		it2.start(); // thread 2 increments the count by 10000
		
	    it1.join();
	    it2.join();

		
		System.out.println(counter.getValue());
		
		Lock l = new ReentrantLock();
		

	}

}
