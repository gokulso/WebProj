package test.multithread.datashare;

import java.util.concurrent.BlockingQueue;

public class DataDisplay implements Runnable {
	
	private BlockingQueue<DataInfo> message;
	
	public DataDisplay(BlockingQueue<DataInfo> message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("waiting to retrieve the data");
		try {
			DataInfo data = message.take();
			System.out.println("gettig the dara successfully " + data);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
