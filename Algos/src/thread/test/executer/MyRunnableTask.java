package thread.test.executer;

public class MyRunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println("From My Runnable  :-" + Thread.currentThread().getName());

	}

}
