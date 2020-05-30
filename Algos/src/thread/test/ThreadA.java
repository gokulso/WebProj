package thread.test;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.setName("ThreadB");
		b.start();
		//b.join();

		synchronized (b) {
			try {
				b.wait(9999);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Total is  : " + b.total + ":-" + Thread.currentThread().getName());
	}
}
