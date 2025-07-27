class Solution {
    public long maximumMedianSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long result=0;
        for(int i=n-2;i>=n/3;i-=2){
            result+=nums[i];
        }
        return result;
    }
}