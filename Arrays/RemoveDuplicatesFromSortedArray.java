package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // considering first element to be unique by default
        int uniqueElements = 1;


        for(int i = 1 ; i < nums.length ; i++) {
            int prevItem = nums[i-1];
            int currItem = nums[i];

            // if current and previous elements are different , it means we found a unique Element
            if(currItem != prevItem) {
                nums[uniqueElements] = nums[i];
                uniqueElements++;
            }

        }

        return uniqueElements;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0 ; i < n ; i++) {
            nums[i] = sc.nextInt();
        }

        int result = removeDuplicates(nums);

        System.out.println(result);

    }

}
