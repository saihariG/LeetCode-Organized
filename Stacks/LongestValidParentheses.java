package Stacks;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        int left = 0, right = 0, maxLength = 0;
        // left scan
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }

            if(left == right) {
                maxLength = Math.max(maxLength,2*right);
            }
            else if(right >= left) {
                left = right = 0;
            }
        }

        left = right = 0;
        // right scan
        for(int i = s.length() -1 ; i >= 0 ; i--) {
            if(s.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }

            if(left == right) {
                maxLength = Math.max(maxLength,2*left);
            }
            else if(left >= right) {
                left = right = 0;
            }

        }
        return maxLength;
    }

    /*
    *

    public int longestValidParentheses(String s) {

        int maxLength = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0; i < s.length() ; i++) {
            // if open paranthesis seen, push into stack
            if(s.charAt(i) == '(') {
                stack.push(i);
            }
            // pop
            else {
                stack.pop();
                // if empty , push current index into stack
                if(stack.isEmpty()) {
                    stack.push(i);
                }
                // maxLength is max of maxLength and (currentIdx - stack's top)
                else {
                    maxLength = Math.max(maxLength,i - stack.peek());
                }
            }
        }

        return maxLength;
    }

     **/
}
