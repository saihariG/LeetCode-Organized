package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {

    // Time Complexity : O(n) ; Space Complexity : O(n)
    public int lengthOfLongestSubstring2(String s) {

        // Two pointer approach
        int i = 0 , j = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        while(j < s.length()) {
            // traversing j until we find a duplicate
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength , set.size());
            }
            // if we find a duplicate, remove it from set & increment i
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }

    // Time Complexity : O(n^2) ; Space Complexity : O(n)
    public int lengthOfLongestSubstring1(String s) {

        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++) {
            int currMax = 0;
            for(int j = i ; j < s.length() ; j++) {
                char c = s.charAt(j);
                if(!set.contains(c)) {
                    set.add(c);
                    currMax++;
                }
                else {
                    set.clear();
                    break;
                }
            }
            if(currMax > maxLength) maxLength = currMax;
        }
        return maxLength;
    }

}
