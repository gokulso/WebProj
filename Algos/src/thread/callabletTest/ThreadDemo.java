package thread.callabletTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
	public static void main(String[] args) {

		// Create a Thread Pool of size 2 (2 here is number of threads in Thread pool.)
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// After creating a pool, it internally starts a Thread, so no need to
		// explicitly start a thread as we did in other approach.
		// Remember only Threads are started but what task they will execute that will
		// be passed to thread using submit() method.
		// In this approach threads will be created and started but they will wait for
		// task to be assigned to them.

		// Create Task to assign it to Threads present in Thread pool.
		ThreadTask threadTask = new ThreadTask();

		// Submit a task to Threads present in Thread pool.
		Future<Result> resultObject = executorService.submit(threadTask);
		// Once a task is submitted to submit method, one of the Thread from the pool
		// will pick the task and execute run method of task.
		// Wait for the result Object(resultObject) that will be returned by Thread
		// after task execution.

		Result result = null;
		try {
			// get method will be blocked until the Thread doesn't complete its work and
			// return a result
			result = resultObject.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println(result.code + " " + result.message);
		executorService.shutdown();
	}

}
