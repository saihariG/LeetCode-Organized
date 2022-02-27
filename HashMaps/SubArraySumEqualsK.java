package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    private int subArraySum(int[] nums , int k) {
        int result = 0 , sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        // key represents sum and value represents its frequency
        map.put(0,1);

        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            // if map contains (sum-k) , then we have a subarray whose value is equal to k
            if(map.containsKey(sum-k)) {
                result += map.get(sum-k);
            }
            // put the sum and its frequency in map
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}
