class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}