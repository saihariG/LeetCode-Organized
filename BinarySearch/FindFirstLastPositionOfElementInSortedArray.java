package BinarySearch;

public class FindFirstLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0) { return new int[]{-1,-1}; }

        int low = 0, high = nums.length-1;
        int startIdx = -1, endIdx = -1;

        // finding the first occurrence
        while(low < high) {

            int mid = (low + high) / 2;

            if(target > nums[mid]) {
                low = mid+1;
            }
            else {
                high = mid;
            }
        }

        startIdx = (nums[low] == target) ? low : -1;
        low = 0 ;
        high = nums.length-1;
        // finding the last occurrence
        while(low < high) {
            int mid = (low + high + 1) / 2;

            if(target < nums[mid]) {
                high = mid-1;
            }
            else {
                low = mid;
            }
        }

        endIdx = (nums[low] == target) ? low : -1;

        return new int[]{startIdx,endIdx};
    }
}
