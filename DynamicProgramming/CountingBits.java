package DynamicProgramming;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i = 1 ; i < ans.length ; i++) {
            // if i is even, number of bits in i is equal to number of set bits in i/2
            if(i % 2 == 0) {
                ans[i] = ans[i/2];
            }
            // if i is odd,number of bits in i is equal to (number of bits in i/2 + 1)
            // Becoz , when dividing by 2, the bit is right shifted so least bit will be lost so we are adding 1
            else {
                ans[i] = 1 + ans[i/2];
            }
        }
        return ans;
    }
}
