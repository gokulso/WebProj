package thread.test.concurr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MaxValueCollection {
	
	private List<Integer> integers = new ArrayList<>();
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public static void main(String[] args) {
		
		MaxValueCollection mvc = new MaxValueCollection();
		
		//mvc.add(10);
		System.out.println(Thread.currentThread().getName() + " adding ");
		for(int i = 11 ; i <= 20 ; i++){
			mvc.add(i);
		}	
		
	
		
		new Thread(()->{
			for(int i = 1 ; i <= 5 ; i++){
				mvc.add(i);
			}	
			System.out.println(Thread.currentThread().getName() + " adding ");
		}).start();
		
		new Thread(()->{
			for(int i = 6 ; i <= 10 ; i++){
				mvc.add(i);
			}	
			System.out.println(Thread.currentThread().getName() + " adding ");
		}).start();
		
		
		new Thread(()->{
			System.out.println(mvc.findMax());
		}).start();
		
		new Thread(()->{
			System.out.println(mvc.findMax());
		}).start();
		
	
		System.out.println(mvc.findMax());

}
	
	

	public void add(Integer i) {
		rwl.writeLock().lock(); // one at a time
		try {	
			integers.add(i);
		} finally {
			rwl.writeLock().unlock();
		}
	}

	public int findMax() {
		rwl.readLock().lock(); // many at once
		try {
			System.out.println(Thread.currentThread().getName() + " Reading");
			return integers.size();
		} finally {
			rwl.readLock().unlock();
		}
	}
	

}