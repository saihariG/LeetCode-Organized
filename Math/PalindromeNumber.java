package Math;

public class PalindromeNumber {

    public boolean isPalindromeWithoutStringConversion(int num) {
        if(num < 0) return  false;

        int reversed = 0, remainder, original = num;

        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }


    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        int start = 0 , end = s.length() -1 ;

        while(start < end) {

            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            else {
                start++;
                end--;
            }

        }
        return true;
    }
}
