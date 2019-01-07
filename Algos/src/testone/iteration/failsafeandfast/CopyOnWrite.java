package testone.iteration.failsafeandfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) {
		// creating a thread-safe Arraylist.
		List<String> threadSafeList = new CopyOnWriteArrayList<>();
		
		//List<String> threadSafeList = new ArrayList<>();
		

		// Adding elements to synchronized ArrayList
		threadSafeList.add("One");
		threadSafeList.add("Two");
		threadSafeList.add("Three");
		threadSafeList.add("Four");
		threadSafeList.add("five");
		threadSafeList.add("six");

		System.out.println("Elements of synchronized ArrayList :");

		// Iterating on the synchronized ArrayList using iterator.
		Iterator<String> it = threadSafeList.iterator();

		while (it.hasNext()) {
			String str = it.next();
			//if ("Two".equals(str))
			//it.remove();
			
			if("six".equals(str))
			threadSafeList.remove("six");
			
			
		}
		
		
	/*	for (String s : threadSafeList){
			if(s.equals("Four"))
				threadSafeList.remove(s);
		}*/
		
		System.out.println(threadSafeList);
	}

}
