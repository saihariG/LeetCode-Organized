package Arrays;

public class SortArrayByParity {
    // Time Complexity : O(n) , Space Complexity : O(1)
    /*** Algorithm
     * there are 4 cases for (A[i] % 2, A[j] % 2):
     *   If it is (0, 1), then everything is correct: i++ and j--.
     *   If it is (1, 0), we swap them so they are correct, then continue.
     *   If it is (0, 0), only the i place is correct, so we i++ and continue.
     *   If it is (1, 1), only the j place is correct, so we j-- and continue.
     */

    public int[] sortArrayByParity(int[] nums) {

        int i = 0 , j = nums.length-1;

        while(i < j) {
            if(nums[i] % 2 > nums[j] % 2) { // 1(odd) > 0(even)
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[i] % 2 == 0) i++;
            if(nums[j] % 2 == 1) j--;
        }

        return nums;
    }
}


/***

 public int[] sortArrayByParity(int[] nums) {

 int[] ans = new int[nums.length];
 int idx = 0;

 for(int i = 0 ; i < nums.length ; i++) {
 if(nums[i] % 2 == 0) {
 ans[idx++] = nums[i];
 }
 }

 for(int i = 0 ; i < nums.length ; i++) {
 if(nums[i] % 2 == 1) {
 ans[idx++] = nums[i];
 }
 }

 return ans;
 }
 }

 ***/
