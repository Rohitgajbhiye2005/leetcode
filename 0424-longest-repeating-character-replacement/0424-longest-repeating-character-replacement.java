import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;  
        int maxLen = 0;  
        int maxFreq = 0;  
        HashMap<Character, Integer> hash = new HashMap<>();  

        for (int r = 0; r < n; r++) {
            
            char charRight = s.charAt(r);
            hash.put(charRight, hash.getOrDefault(charRight, 0) + 1);
            
           
            maxFreq = Math.max(maxFreq, hash.get(charRight));
            
            if ((r - l + 1) - maxFreq > k) {
                
                char charLeft = s.charAt(l);
                hash.put(charLeft, hash.get(charLeft) - 1);
                l++;
            }
            
            
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
