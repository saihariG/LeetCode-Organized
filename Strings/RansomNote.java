package Strings;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        for(char c : ransomNote.toCharArray()) {
            hash1[c-'a']++;
        }

        for(char c : magazine.toCharArray()) {
            hash2[c-'a']++;
        }


        for(int i = 0 ; i < 26 ; i++) {
            if(hash1[i] > 0) {
                if(hash2[i] < hash1[i]) return false;
            }
        }

        return true;
    }
}
