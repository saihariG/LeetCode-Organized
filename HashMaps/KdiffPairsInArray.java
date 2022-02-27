package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsInArray {
    public int findPairs(int[] nums , int k) {

        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();

        // counting the frequencies of each element in array
        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i : map.keySet()) {
            // if k = 0 , then look for dupicate elements, if there's a duplicate then there's a pair
            if( k == 0 && map.get(i) > 1 || k > 0 && map.containsKey(i+k)) {
                pairs++;
            }
        }
        return pairs;
    }
}
