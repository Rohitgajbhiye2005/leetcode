class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int maxBeauty = 0;
        int left = 0;

        
        for (int right = 0; right < n; right++) {
          
            while (nums[right] - nums[left] > 2 * k) {
                left++;
            }
           
            maxBeauty = Math.max(maxBeauty, right - left + 1);
        }

        return maxBeauty; 
    }
}