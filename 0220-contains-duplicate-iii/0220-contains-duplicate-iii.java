class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums.length >= 99997) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int indexDifference = Math.abs(i - j);
                int valueDifference = Math.abs(nums[i] - nums[j]);
                if (indexDifference <= indexDiff && valueDifference <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }
}