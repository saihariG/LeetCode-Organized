package Strings;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;
            }
            else {
                stack.push(new int[]{ch,1});
            }

            if(stack.peek()[1] == k) {
                stack.pop();
            }
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            int[] top = stack.pop();
            while(top[1]-- > 0) {
                res.append((char) top[0]);
            }
        }

        return res.reverse().toString();
    }
}
