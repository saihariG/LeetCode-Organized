package Arrays;

import java.util.PriorityQueue;

public class KthLargestElement {
    private int findKthLargest(int[] nums , int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums) {
            minHeap.add(num);
        }

        int result = 0;
        for(int i = 0 ; i < nums.length - k + 1 ; i++) {
            result = minHeap.remove();
        }
        return result;
    }
}
