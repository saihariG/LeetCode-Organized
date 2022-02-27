package Strings;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        int[] hash = new int[26];

        for(char c : s.toCharArray()) {
            hash[c-'a']++;
        }

        for(int i = 0 ; i < t.length() ; i++) {

            char c = t.charAt(i);

            if(hash[c-'a'] > 0) {
                hash[c-'a']--;
            }
            else if(hash[c-'a'] == 0) {
                return c;
            }
        }

        return ' ';
    }
}
