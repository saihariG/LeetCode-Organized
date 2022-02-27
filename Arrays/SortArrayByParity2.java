package Arrays;

public class SortArrayByParity2 {
    private int[] sortArrayByParity2(int[] nums) {
        // pointer to traverse odd index
        int j = 1;
        // i is pointer to traverse even index
        for(int i = 0 ; i < nums.length ; i += 2) {
            // if the element in even index is not even , then
            // find an even element in odd index and swap
            if(nums[i] % 2 != 0) {
                // searching an even element in odd index
                while(nums[j] % 2 != 0) {
                    j += 2;
                }
                // swapping
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
