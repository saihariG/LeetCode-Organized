package Stacks;

import java.util.Stack;

public class RemoveKDigits {

    private String removeKDigits(String num,int k) {

        int n = num.length();
        Stack<Character> stack = new Stack<>();
        // traversing the string
        for(int i = 0; i < n ; i++) {
            char c = num.charAt(i);
            // if we find a non-increasing pattern
            while(!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            // since leading zeros cannot be included
            if(!stack.isEmpty() || c != '0') {
                stack.push(c);
            }
        }
        // special case : where no elements are removed
        // may be k == n or elements are in non-decreasing order : eg -> 123
        while(!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if(stack.isEmpty()) return "0";
        // Now, the smallest possible integer is stored in stack
        // concatenating the smallest possible integer in our stack, to given string
        int size = stack.size();
        while(!stack.isEmpty()) {
            num += stack.pop();
        }
        // Now our given string contains original string + the smallest possible integer (in reverse order)
        // so, extracting the needed string using substring() method
        StringBuilder sb = new StringBuilder(num.substring(num.length()-size));
        // returning the reversed string
        return sb.reverse().toString();
    }
}
