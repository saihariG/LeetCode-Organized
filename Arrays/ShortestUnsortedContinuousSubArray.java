package Arrays;

public class ShortestUnsortedContinuousSubArray {
    public int findUnsortedSubarray(int[] nums) {

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        boolean flag = false;

        // Determining the minimum element based on falling slope
        for(int i = 1; i < nums.length ; i++) {
            if(nums[i] < nums[i-1]) {
                flag = true;
            }
            if(flag) {
                min = Math.min(min,nums[i]);
            }
        }

        flag = false;
        // Determining the minimum element based on rising slope
        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            if(nums[i] > nums[i+1]) {
                flag = true;
            }
            if(flag) {
                max = Math.max(max,nums[i]);
            }
        }

        // Now,determining the left & right boundaries based on min & max element
        int l,r;
        for(l = 0 ; l < nums.length ; l++) {
            if(min < nums[l]) break;
        }

        for(r = nums.length-1 ; r >= 0 ; r--) {
            if(max > nums[r]) break;
        }

        return (r-l) > 0 ? (r - l + 1) : 0;
    }
}

/***

 Stack<Integer> stack = new Stack<>();
 int l = nums.length, r = 0;

 // To determine the correct position of the minimum element
 for(int i = 0 ; i < nums.length ; i++) {
 //  As we go on a rising slope, pushing indices into stack
 //  When encountered a falling slope, wkt nums[i] isn't at correct position
 while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
 l = Math.min(l,stack.pop());
 }
 stack.push(i);
 }

 stack.clear();
 // To determine the correct position of the minimum element
 for(int i = nums.length-1 ; i >=0 ; i--) {
 //  As we go on a falling slope, pushing indices into stack
 //  When encountered a rising slope, wkt nums[i] isn't at correct position
 while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
 r = Math.max(r,stack.pop());
 }
 stack.push(i);
 }

 return r-l > 0 ? r-l+1 : 0;

 ***/