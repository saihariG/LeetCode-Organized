package Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        // storing cumulative multiplication values from left
        for(int i = 1 ; i < nums.length ; i++) {
            answer[i] = nums[i] * answer[i-1];
        }

        int product = 1;
        for(int i = nums.length-1 ; i > 0 ; i--) {
            answer[i] = answer[i-1] * product;
            product *= nums[i];
        }
        answer[0] = product;

        return answer;
    }
}
