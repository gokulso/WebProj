package thread.multithread.datashare;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class DataExchangeDemo {

	public static void main(String[] args) {
		BlockingQueue<DataInfo> message = new ArrayBlockingQueue<>(5);
	   
		DataRetrieving retrive = new DataRetrieving(message);
		
		DataDisplay  dsiplay = new DataDisplay(message);
		
		new Thread(retrive).start();
		new Thread(dsiplay).start();
		
	}

}
