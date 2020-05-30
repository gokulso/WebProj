package thread.test.executer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuterServiceTest {

	public static void main(String[] args) {
		
		
		Runnable r = new MyRunnableTask();
		Executor ex = new NewThreadExecutor();
		ex.execute(r);
		
		// with lambda
		
		Runnable r1  = ()-> System.out.println("From My Runnable lamda  " + Thread.currentThread().getName());
		Executor ex1 = (e)-> new Thread(e).start();
		ex1.execute(r1);
		
		
		// with ExecutorService Cached Thread Pools
		
		Runnable r2 = new MyRunnableTask();
		ExecutorService ex2 = Executors.newCachedThreadPool(); // subtype of Executor
		ex2.execute(r2);
		
		//Fixed Thread Pools—Most Common
		
		//ExecutorService exfix = Executors.newCachedThreadPool();
		
		
		
		ExecutorService exfix = Executors.newFixedThreadPool(4);
		
		ThreadPoolExecutor tp = (ThreadPoolExecutor)exfix;
		  System.out.println("Maximum threads inside pool " + tp.getMaximumPoolSize());
		
		for (int i = 0; i < 10; i++){
			Runnable r3 = new MyRunnableTask();
            System.out.println("A new task has been added : " + i);
            exfix.execute(r3);
        }
		
		
		exfix.shutdown();
		
	}

}
