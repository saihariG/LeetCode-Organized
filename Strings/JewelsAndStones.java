package Strings;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        int[] lowHash = new int[26];
        int[] highHash = new int[26];

        for(char c : jewels.toCharArray()) {
            if(Character.isLowerCase(c)) {
                lowHash[c-'a']++;
            }
            else {
                highHash[c-'A']++;
            }
        }

        int jewel = 0;
        for(char c : stones.toCharArray()) {
            if(Character.isUpperCase(c)) {
                if(highHash[c-'A'] > 0) {
                    jewel++;
                }
            }
            else {
                if(lowHash[c-'a'] > 0) {
                    jewel++;
                }
            }
        }
        return jewel;
    }
}
