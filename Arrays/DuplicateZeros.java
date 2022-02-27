package Arrays;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {

        if(arr == null || arr.length == 0) return;

        int zerosCount = 0;
        int n = arr.length;

        // counting number of zeros
        for(int i : arr)
            if(i == 0) zerosCount++;

        // number of zeros indicate additional space needed(virtually) , so assign a imaginary position j and start traversing from right of array
        for(int i = n-1 , j = n + zerosCount-1 ; i < j ; i--, j--) {

            // if element is 0, duplicate twice
            if(arr[i] == 0) {
                if(j < n) { // to avoid index out of bounds
                    arr[j] = 0;
                }
                j--;
                if(j < n) {
                    arr[j] = 0;
                }
            }
            else {
                // if non-zero element , simply copy to jth index
                if(j < n) arr[j] = arr[i];
            }
        }
    }


}
