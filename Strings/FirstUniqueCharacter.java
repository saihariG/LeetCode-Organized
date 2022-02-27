package Strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {

        Map<Character,Integer> map  = new HashMap<>();

        for(char c : s.toCharArray()) {

            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        for(int i = 0 ; i < s.length() ; i++) {

            char c = s.charAt(i);

            int freq = map.get(c);

            if(freq == 1) return i;

        }


        return -1;
    }

    public int firstUniqChar2(String s) {
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public int firstUniqChar3(String str) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                queue.remove(map.get(str.charAt(i)));
            }else{
                map.put(str.charAt(i), i);
                queue.add(i);
            }
        }
        if(queue.isEmpty())
            return -1;
        return queue.peek();
    }
}

