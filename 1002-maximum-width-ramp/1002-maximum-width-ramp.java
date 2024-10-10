class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] maxOnRight = new int[nums.length];
        maxOnRight[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            maxOnRight[i] = Math.max(maxOnRight[i+1], nums[i]) ;;
            }
        int maxRamp = 0;
        int left = 0, right = 0;
        while(right < nums.length) {
            while ( left <= right && nums[left] > maxOnRight[right]) {
                left++;
            }
            maxRamp = Math.max(maxRamp, right - left );
            right++;
            }
        return maxRamp;
        }
}