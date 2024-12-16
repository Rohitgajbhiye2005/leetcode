class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int returnCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            position += nums[i];
            if (position == 0) {
                returnCount++;
            }
        }
        
        return returnCount;
    }
}