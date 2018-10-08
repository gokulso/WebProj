package thread.test;

public class ThreadB extends Thread {

	int total;

	@Override
	public synchronized void run() {

		for (int i = 0; i < 100; i++) {
			total += i;
		}

		System.out.println("In Run :- " + Thread.currentThread().getName());
	}

}
