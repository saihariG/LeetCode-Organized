package Strings;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        // if we find a hashtag, then we should delete the hashtag & its previous character
        for(int i = 0 ; i < s.length() ; i++) {
            char cur = s.charAt(i);

            // if the first character is hashtag,then there will be no previous character to delete
            if(cur == '#' && i == 0) {
                s = s.substring(i+1);
                i = -1;  // do until we don't find any hashtags in string
                continue;
            }

            if(cur == '#') {
                s = s.substring(0,i-1) + s.substring(i+1);
                i = -1;
            }
        }

        System.out.println(s);

        // same logic as explained in the previous loop
        for(int i = 0 ; i < t.length() ; i++) {
            char cur = t.charAt(i);

            if(cur == '#' && i == 0) {
                t = t.substring(i+1);
                i = -1;
                continue;
            }

            if(cur == '#') {
                t = t.substring(0,i-1) + t.substring(i+1);
                i = -1;
            }
        }

        System.out.println(t);

        return s.equals(t);
    }
}
