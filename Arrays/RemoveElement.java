package Arrays;

import java.util.Scanner;

public class RemoveElement {
    public static  int removeElement(int[] nums, int val) {

        int k = 0;

        // skip if the current Item matches val , else have a pointer to fill the elements
        for(int i = 0 ; i < nums.length ; i++) {

            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n ; i++) {
            nums[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        int result = removeElement(nums,val);
        System.out.println(result);
    }

}
