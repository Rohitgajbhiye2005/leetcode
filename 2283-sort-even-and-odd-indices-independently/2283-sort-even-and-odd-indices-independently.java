import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        
        int evenCount = (n + 1) / 2;  
        int oddCount = n / 2;         

       
        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];

        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evens[i / 2] = nums[i];  
            } else {
                odds[i / 2] = nums[i];   
            }
        }

        
        Arrays.sort(evens);

       
        Arrays.sort(odds);
        for (int i = 0; i < oddCount / 2; i++) {
            int temp = odds[i];
            odds[i] = odds[oddCount - 1 - i];
            odds[oddCount - 1 - i] = temp;
        }

        for (int i = 0; i < evenCount; i++) {
            nums[2 * i] = evens[i];  
        }
        for (int i = 0; i < oddCount; i++) {
            nums[2 * i + 1] = odds[i];  
        }

        return nums;
    }
}
