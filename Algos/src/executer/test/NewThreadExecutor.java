package executer.test;

import java.util.concurrent.Executor;

public class NewThreadExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();

	}

}
