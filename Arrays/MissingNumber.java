package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {

        // summation 0 to n = n * (n+1) / 2;
        int expectedSum = (nums.length * (nums.length + 1) ) / 2;
        int actualSum = 0;

        for(int i : nums) {
            actualSum  = actualSum + i;
        }

        return (expectedSum - actualSum);
    }
}
