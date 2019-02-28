package thread.test;

public class MyDeadlock {
	
	String str1 = "Java";
	String str2 = "Unix";
	
	Thread thread1 = new Thread(() -> {
		while (true) {
			synchronized (str1) {
				synchronized (str2) {
					System.out.println(str1 +" :# " + str2 + Thread.currentThread().getName());
				}
			}
		}
	}); 
	
	
	
	Thread thread2 = new Thread(() -> {
		while (true) {
			synchronized (str2) {
				synchronized (str1) {
					System.out.println(str2 + " :* " + str1 + Thread.currentThread().getName());
				}
			}
		}
	});


	public static void main(String[] args) {
		MyDeadlock dl = new MyDeadlock();
		
		dl.thread1.start();
		dl.thread2.start();
	}

}
