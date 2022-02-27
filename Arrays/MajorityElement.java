package Arrays;

import java.util.Arrays;

public class MajorityElement {
    private int majorityElement(int[] nums) {

        Integer candidate = null;
        int count = 0;

        for(int num : nums) {
            if(count == 0) candidate = num;

            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }

    private int majorityElements2(int[] nums) {
        Arrays.sort(nums);
        int neededFreq = nums.length / 2;
        int majEle = nums[0];
        int freq = 1;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == majEle) {
                freq++;
            }
            else {
                if(freq <= neededFreq) {
                    majEle = nums[i];
                    freq = 1;
                }
            }
        }
        return majEle;
    }
}
