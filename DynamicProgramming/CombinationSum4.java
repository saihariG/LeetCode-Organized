package DynamicProgramming;

public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {

        Integer[] dp = new Integer[target+1];
        return cs(nums,target,dp);

    }

    static int cs(int[] nums, int target, Integer[] dp) {

        if(target == 0) return 1;
        if(target < 0) return 0;
        if(dp[target] != null) return dp[target];

        int count = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            count += cs(nums,target-nums[i],dp);
        }

        dp[target] = count;
        return dp[target];
    }
}
