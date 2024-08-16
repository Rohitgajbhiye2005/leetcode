import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); 
        int l = 0; 
        int r = 0; 
        int len = 0; 
        HashMap<Character, Integer> hash = new HashMap<>(); 

        while (r < n) { 
            char currentChar = s.charAt(r); 
            if (hash.containsKey(currentChar)) {
                l = Math.max(hash.get(currentChar) + 1, l); 
            }
            len = Math.max(len, r - l + 1); 
            hash.put(currentChar, r); 
            r++;
        }

        return len; 
    }
}
