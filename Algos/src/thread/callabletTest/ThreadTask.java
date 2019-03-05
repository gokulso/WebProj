package thread.callabletTest;

import java.util.concurrent.Callable;

class ThreadTask implements Callable<Result> {

	// method where the thread execution takes place
	public Result call() {
		// Code present here will be executed in separate independent path.
		Result response = new Result();
		response.code = 200;
		response.message = "SUCCESS";
		System.out.println(Thread.currentThread().getName());
		
		return response;
	}

}

class Result {
	public int code;
	public String message;
}