package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsToReduceXtoZero {

    public int minOperations(int[] nums, int x) {
        int totalSum = 0 , currSum = 0, maxLength = 0;

        for(int num : nums) {
            totalSum += num;
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i = 0 ; i < nums.length ; i++) {
            currSum += nums[i];

            if(map.containsKey(currSum-(totalSum-x)))
                maxLength = Math.max(maxLength,i-map.get(currSum-(totalSum-x)));

            if(!map.containsKey(currSum))
                map.put(currSum,i);
        }

        if(x != totalSum && maxLength == 0)
            return -1;

        return nums.length-maxLength;
    }

    /***
    // Two Pointer approach
    public int minOperations(int[] nums, int x) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int currSum = 0 , maxLength = -1;

        for(int left = 0 , right = 0 ; right < nums.length ; right++) {
            currSum += nums[right];

            while(left <= right && currSum > sum-x) {
                currSum -= nums[left];
                left++;
            }

            if(currSum == sum-x) {
                maxLength = Math.max(maxLength,right-left+1);
            }
        }

        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
     ***/
}
