package thread.test;

class MyThread extends Thread {
	
	public static void main(String[] args) {
		//MyThread t = new MyThread();
		MyRunnable t = new MyRunnable();
		Thread x = new Thread(t);
		//x.run();
		x.start();

		
		new Thread(()->System.out.println("In lamda :- " + Thread.currentThread().getName())).start();
	
		System.out.println("In Main :- " + Thread.currentThread().getName());
		
		
		
	}

	public void run() {
		for (int i = 0; i < 3; ++i) {
			System.out.print(i + "..");
		}
		
		System.out.println("In Run :- " + Thread.currentThread().getName());
	}
}