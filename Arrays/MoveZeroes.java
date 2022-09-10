package Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        // Algorithm
        // 1. Have Two pointers left and right initialized to zero
        // 2. traverse the array throught right pointer
        // 3. If nums[right] is zero, then skip
        // 4 .else swap the item with left pointer and increment left pointer

        for(int left = 0 , right = 0 ;  right < nums.length ; right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

    }
}
