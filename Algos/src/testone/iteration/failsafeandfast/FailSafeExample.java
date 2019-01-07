package testone.iteration.failsafeandfast;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		Map<String, String> premiumPhone = new ConcurrentHashMap<>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		//premiumPhone.put(null, "null");


		Iterator<String> iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			
			/*if("Apple".equals(s))
				iterator.remove();*/
			
	      System.out.println(s);
		}
		
      System.out.println(premiumPhone);
		//System.out.println("After ");
		
	/*	Iterator<String> iterator1 = premiumPhone.keySet().iterator();
		
		while (iterator1.hasNext()) {
			System.out.println(premiumPhone.get(iterator1.next()));
			premiumPhone.put("Sony", "Xperia Z");
		  
		}
*/

	}

}