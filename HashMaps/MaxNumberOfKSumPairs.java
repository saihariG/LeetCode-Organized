package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {

        int numberOfOperations = 0;
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            // since nums[i] + target == k
            int target = k-nums[i];

            // if map contains target, then increment operations
            if(freqMap.containsKey(target)) {
                numberOfOperations++;

                // decrementing the frequency for target
                // if freq is 1, then remove the target
                if(freqMap.get(target) == 1)
                    freqMap.remove(target);
                else
                    freqMap.put(target,freqMap.get(target)-1);

            }
            else {
                // mapping the item & it's frequency
                freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
            }
        }

        return numberOfOperations;
    }
}
