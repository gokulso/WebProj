package thread.test.concurr;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	//private int count;
	
	private AtomicInteger count = new AtomicInteger();

	public  void increment() {
	//	count++; // it's a trap! a single "line" is not atomic
		
		count.getAndIncrement();
	}

	public int getValue() {
		return count.intValue();
	}
}