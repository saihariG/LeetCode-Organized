package Strings;

public class ReverseString {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start < end) {

            // swapping
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

    }
}
