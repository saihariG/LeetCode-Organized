package Strings;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end  = s.length() - 1;

        while(start < end) {

            // found mismatched character , so try both deletions
            if(s.charAt(start) != s.charAt(end)) {
                return (checkPalindrome(s,start,end-1) || checkPalindrome(s,start+1,end));
            }

            start++;
            end--;
        }

        return true;
    }

    public boolean checkPalindrome(String s, int i, int j) {

        while(i < j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
