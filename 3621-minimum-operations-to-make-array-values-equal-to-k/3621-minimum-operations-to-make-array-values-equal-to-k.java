class Solution {
    public int minOperations(int[] nums, int k) {
      for (int num : nums) if (num < k) return -1;
        Arrays.sort(nums);
        int operations = 0, currentMax = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0 && nums[i] > k; i--) {
            if (nums[i] < currentMax) {
                operations++;
                currentMax = nums[i];
            }
        }
        return currentMax > k ? operations + 1 : operations;   
    }
}