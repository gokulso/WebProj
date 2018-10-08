package testone.collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTest {

    public static void main(String[] args) {
    	


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(4, 11);
        System.out.println(map.hashCode());
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 11);
        map1.put(4, 11);
        System.out.println(map1.hashCode());
        if (map.equals(map1)) {
            //System.out.println("equal ");
            
            
            
        	List<String> list1 = Arrays.asList("pollinating sandboxes", new String("pollinating sandboxes"),
                    "amusement & hemophilias",
                    "schoolworks = perversive",
                    "electrolysissweeteners.net",
                    "constitutionalunstableness.net",
                    "grinnerslaphappier.org",
                    "BLEACHINGFEMININELY.NET",
                    "WWW.BUMRACEGOERS.ORG",
                    "WWW.RACCOONPRUDENTIALS.NET",
                    "Microcomputers: the unredeemed lollipop...",
                    "Incentively, my dear, I don't tessellate a derangement.",
                    "A person who never yodelled an apology, never preened vocalizing transsexuals.");
        	int i = 0;
        	for( String s:list1){
        		i++;
        		System.out.println(i + ":- " +s.hashCode());
        		
        	}
        }
    }
    
}


