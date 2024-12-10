class Solution {
    public int maximumLength(String s) {
       int n = s.length();
        
       
        for (int len = n; len > 0; len--) {
          
            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);
             
                if (isSpecial(sub) && countOccurrences(s, sub) >= 3) {
                    return len;
                }
            }
        }
      
        return -1;  
    }
     private boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    private int countOccurrences(String s, String sub) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index++; 
        }
        return count;
    }
}