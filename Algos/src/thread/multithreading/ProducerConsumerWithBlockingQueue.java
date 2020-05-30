package thread.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerWithBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<>();

		Producer p = new Producer(sharedQ);
		Consumer c = new Consumer(sharedQ);

		new Thread(p).start();
		new Thread(c).start();

	}

}

class Producer implements Runnable {
	private BlockingQueue<Integer> sharedQueue;

	public Producer(BlockingQueue<Integer> aQueue) {
		this.sharedQueue = aQueue;
		
		Thread.currentThread().setName("Producer");
	}

	public void run() {
		// no synchronization needed
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+ " produced " + i);
				sharedQueue.put(i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue<Integer> sharedQueue;

	public Consumer(BlockingQueue<Integer> aQueue) {
		Thread.currentThread().setName("Consumer");
		this.sharedQueue = aQueue;
	}

	public void run() {
		try {
			while (true) {
				Integer item = sharedQueue.take();
				System.out.println(Thread.currentThread().getName() + " consumed " + item);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
