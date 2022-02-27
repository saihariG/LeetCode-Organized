package Stacks;

import java.util.Stack;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
            if(Character.isLetter(c))
                stack.push(c);

        String result = "";
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                result += stack.pop();
            }
            else {
                result += c;
            }
        }
        return result;
    }

    public String reverseOnlyLetters2(String s) {

        String result = "";
        // pointer for traversing the string backwards
        int end = s.length() - 1;

        for(int start = 0 ; start < s.length()  ; start++ ) {
            // if character at start is a Letter then it should be placed in reversed position
            if(Character.isLetter(s.charAt(start))) {
                // look for a character at end to place the start character
                while(!Character.isLetter(s.charAt(end)))
                    end--;
                // appending the character to result string
                result += s.charAt(end);
                end--;
            }
            // if character at is not a Letter,then it can be simply appended
            else {
                result += s.charAt(start);
            }

        }
        return result;
    }
}
