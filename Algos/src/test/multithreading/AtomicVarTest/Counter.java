package test.multithreading.AtomicVarTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	ExecutorService es = Executors.newFixedThreadPool(4);

	private volatile AtomicInteger counter = new AtomicInteger();

	public  void increament() {
		counter.getAndIncrement();
	}

	public int getValue() {
		return counter.intValue();
	}

}
