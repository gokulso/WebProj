package thread.test.executer;

import java.util.concurrent.Executor;

public class ExecuterServiceTest {

	public static void main(String[] args) {
		
		
		Runnable r = new MyRunnableTask();
		Executor ex = new NewThreadExecutor();
		ex.execute(r);
		
		// with lambda
		
		Runnable r1  = ()-> System.out.println("From My Runnable lamda  " + Thread.currentThread().getName());
		Executor ex1 = (e)-> new Thread(e).start();
		ex1.execute(r1);
	}

}
