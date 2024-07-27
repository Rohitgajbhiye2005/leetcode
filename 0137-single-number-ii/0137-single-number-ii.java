class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int tows=0;
        for(int i=0;i<nums.length;i++){
            ones=(nums[i]^ones)&(~tows);
            tows=(nums[i]^tows)&(~ones);
        }
        return ones;
    }
}