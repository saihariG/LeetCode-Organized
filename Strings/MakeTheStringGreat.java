package Strings;

public class MakeTheStringGreat {
    public String makeGood(String s) {

        for(int i = 0 ; i < s.length() - 1 ; i++) {

            char c = s.charAt(i);
            char n = s.charAt(i+1);

            if(Character.isUpperCase(c) && Character.isLowerCase(n) || Character.isUpperCase(n) && Character.isLowerCase(c)) {
                if(Character.toUpperCase(c) == Character.toUpperCase(n)) {
                    s = s.substring(0, i) + s.substring(i+2);
                    i = -1;
                }
            }
        }

        return s;
    }
}
