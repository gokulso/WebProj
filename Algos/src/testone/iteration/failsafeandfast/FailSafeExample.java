package testone.iteration.failsafeandfast;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		Map<String, String> premiumPhone = new ConcurrentHashMap<>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");


		Iterator<String> iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		System.out.println("After ");
		
		Iterator<String> iterator1 = premiumPhone.keySet().iterator();
		
		while (iterator1.hasNext()) {
			System.out.println(premiumPhone.get(iterator1.next()));
			//premiumPhone.put("Sony", "Xperia Z");
		}


	}

}