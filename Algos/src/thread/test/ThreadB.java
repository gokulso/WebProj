package thread.test;

public class ThreadB extends Thread {

	int total;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 0; i < 100; i++) {
				total += i;
			}
			
			

			System.out.println("In Run :- " + Thread.currentThread().getName());

		   notify();
		}
	}

}
