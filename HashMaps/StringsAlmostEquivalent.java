package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class StringsAlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character,Integer> map  = new HashMap<>();

        for(int i = 0 ; i < word1.length() ; i++) {

            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            map.put(c1, map.getOrDefault(c1,0)+1);
            map.put(c2, map.getOrDefault(c2,0)-1);

        }

        for(int i : map.values()) {
            if(i > 3 || i < -3) {
                return false;
            }
        }

        return true;
    }

}
