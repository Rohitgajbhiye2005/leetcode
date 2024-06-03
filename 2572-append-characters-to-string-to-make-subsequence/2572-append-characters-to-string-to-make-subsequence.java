class Solution {
    public int appendCharacters(String s, String t) {
        
        int T = t.length();
        int tindex = 0;
        
        for (char c : s.toCharArray()) {
            if (tindex >= T) {
                break;
            }
            
            if (c == t.charAt(tindex)) {
                tindex += 1;
            }
        }
        
        return T - tindex;
    }
 
    }
