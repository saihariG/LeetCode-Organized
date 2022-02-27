package Strings;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {

        int capsCount = 0;

        for(char c : word.toCharArray()) {
            // count no of capital letters in String
            if('Z'-c >= 0) {
                capsCount++;
            }
        }

        // Returns true
        //   1. if there is no capital letter or
        //   2. if all letters are capital
        //   3. if only first letter is capital
        if(capsCount == 0 || capsCount == word.length() || (capsCount == 1 && 'Z' - word.charAt(0) >= 0) ){
            return true;
        }else {
            return false;
        }
    }
}
