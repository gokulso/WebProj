package testone.iteration.failsafeandfast;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeItr {
	public static void main(String[] args) {

		Map<String, String> map = new ConcurrentHashMap<>();

		map.put("A", "Raju");
		map.put("H", "Ramu");
		
		Iterator<String> it = map.keySet().iterator();


		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
			map.put("O", "John");

		}
		
		/*Iterator<String> it2 = map.keySet().iterator();
		System.out.println("After.................");
		
		while (it2.hasNext()) {
			System.out.println(map.get(it2.next()));

		}*/
	}
}