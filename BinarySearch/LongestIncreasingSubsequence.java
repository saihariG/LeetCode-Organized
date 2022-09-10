package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    // Time : O(n^2)
    // space : O(n)
    public int lengthOfLIS(int[] nums) {
        List<Integer> lis = new ArrayList<>();

        for(int num : nums) {
            int size = lis.size();

            if(size == 0 || (size > 0 && num > lis.get(size-1))) {
                lis.add(num);
            }
            else {
                int idx = binarySearch(lis,num);
                lis.set(idx,num);
            }
        }

        return lis.size();
    }

    static int binarySearch(List<Integer> lis, int target) {
        int low = 0;
        int high = lis.size()-1;

        while(low < high) {
            int mid = (low+high) / 2;

            if(lis.get(mid) < target) {
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

}


/*
    // Time : O(n^2)
    // space : O(n)
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis,1);
        int max = Integer.MIN_VALUE;

        for(int i = 1 ; i < nums.length ; i++) {
            for(int j = 0 ; j < i ; j++) {
                if(nums[i] > nums[j] && lis[i] <= lis[j]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // finding the max value
        for(int i = 0 ; i < lis.length ; i++) {
            if(lis[i] > max) {
                max = lis[i];
            }
        }

        return max;
    }
*/