package BinarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int middle = (low + high) / 2;
        int mid = 0;

        while(low <= high) {

            mid = (low + high) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
        }

        return (mid < middle) ? low : high + 1;


    }
}