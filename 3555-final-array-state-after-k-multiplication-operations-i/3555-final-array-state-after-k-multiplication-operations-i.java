class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add(num);
        }
        
      
        while (k > 0) {
          
            int min = minHeap.poll();
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == min) {
                    nums[i] = min * multiplier;
                    
                    minHeap.add(nums[i]);
                    break;
                }
            }
            
            k--;
        }
        
        return nums;
    }
    
}