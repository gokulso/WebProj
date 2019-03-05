package thread.multithread.datashare;


import java.util.concurrent.BlockingQueue;

public class DataRetrieving implements Runnable{
	

	private BlockingQueue<DataInfo> message;

	
	public DataRetrieving(BlockingQueue<DataInfo> message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		 
		try {
		DataInfo data = retrievingdata();
			message.put(data);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// Asume this is a big task to retrieve the data
	private DataInfo retrievingdata() throws InterruptedException {
		System.out.println("In retrievingdata method");
		Thread.sleep(1000);
		
		DataInfo data= new DataInfo(1,"John");
	
		
		
		return data;
	}

}
