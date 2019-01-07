package test.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class DabCallTest {

	
	public static void main(String[] args) {
		
		Buffer buffer = new Buffer(2);
		
		Thread produce = new Thread(() -> {
			try {
				int value = 0;
				while (true) {
					buffer.add(value);
					System.out.println("produce " + value);
					Thread.sleep(1000);
					value++;
				}

			} catch (InterruptedException e) {

			}

		});
		
		
		Thread consume = new Thread(() -> {

			try {
				while (true) {
					int value = buffer.poll();
					System.out.println("consume " + value);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
                   e.printStackTrace();
			}

		});
		
		produce.start();
		consume.start();
	}
	
	
	public static class Buffer{
		
		Queue<Integer> list;
		int size;
		
		public Buffer(int size){
			this.list = new LinkedList<>();
			this.size= size;
		}
		
		public void add(int a) throws InterruptedException {
			synchronized (this) {
				if (list.size() >= size) {
					wait();
				}
				list.add(a);
				notify();
			}
		}
		
		public int poll() throws InterruptedException {

			synchronized (this) {
				if (list.size() == 0) {
					wait();
				}

				int value = list.poll();
				notify();
				return value;
			}
		}
	}

}
