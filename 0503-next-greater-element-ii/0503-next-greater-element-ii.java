class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];  
        Stack<Integer> st = new Stack<>();
        
        
        for (int i = 0; i < n; i++) {
            nge[i] = -1;
        }
        
   
        for (int i = 2 * n - 1; i >= 0; i--) {
            int actualIndex = i % n; 
            
            
            while (!st.isEmpty() && nums[st.peek()] <= nums[actualIndex]) {
                st.pop();
            }
            
           
            if (i < n && !st.isEmpty()) {
                nge[actualIndex] = nums[st.peek()];
            }
            
          
            st.push(actualIndex);
        }
        
        return nge;
    }
}
