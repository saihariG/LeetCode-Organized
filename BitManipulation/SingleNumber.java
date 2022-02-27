package BitManipulation;

// #leetcode136
public class SingleNumber {
    private int singleNumber(int[] nums) {
        int n = 0 ;

        for(int item : nums) {
            n ^= item;
        }

        return n;
    }

}
