import java.util.*;

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCounts = new int[k];
    
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; 
            remainderCounts[remainder]++;
        }
       
        for (int i = 1; i < k; i++) {
            if (remainderCounts[i] != remainderCounts[k - i]) {
                return false; 
            }
        }
        
       
        return remainderCounts[0] % 2 == 0;
    }
}
