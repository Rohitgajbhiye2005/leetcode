import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)1e9 + 7;
        
       
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        
        long total = 0;
        
        
        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (long)arr[i] * left * right) % mod;
        }
        
        return (int)total;
    }

    
    public int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                nse[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            nse[stack.pop()] = n; 
        }
        
        return nse;
    }

   
    public int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                pse[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            pse[stack.pop()] = -1; 
        }
        
        return pse;
    }
}
