package thread.test;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.setName("ThreadB");
		b.start();

		synchronized (b) {
			try {
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Total is  : " + b.total + ":-" + Thread.currentThread().getName());
	}
}
