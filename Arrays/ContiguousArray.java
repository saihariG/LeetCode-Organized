package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    private int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // key : count , value : Index

        int maxSize = 0 , count = 0;
        for(int i = 0 ; i < nums.length ; i++) {

            int currSize = 0;

            if(nums[i] == 0)
                count--;
            else
                count++;

            if(!map.containsKey(count)) {
                map.put(count,i);
            }
            else {
                currSize = i - map.get(count);
            }

            if(currSize > maxSize) maxSize = currSize;
        }
        return maxSize;

    }
}
