class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        StringBuilder str = new StringBuilder();
        int i = 25; 
        
        while (i >= 0) {
            if (arr[i] > 0) { 
                int count = 0; 
                while (arr[i] > 0 && count < repeatLimit) {
                    str.append((char) (i + 'a'));
                    arr[i]--;
                    count++;
                }
                if (arr[i] > 0) {
                    int j = i - 1;
                    while (j >= 0 && arr[j] == 0) {
                        j--;
                    }
                    
                    if (j < 0) break; 
                    str.append((char) (j + 'a'));
                    arr[j]--; 
                }
            } else {
                i--; 
            }
        }
        
        return str.toString();
    }
}