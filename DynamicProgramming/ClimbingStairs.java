package DynamicProgramming;

public class ClimbingStairs {
    public int climbStairs(int n) {

        int[] ways = new int[46];

        ways[1] = 1;
        ways[2] = 2;

        for(int i = 3 ; i < 46 ; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[n];
    }
}
