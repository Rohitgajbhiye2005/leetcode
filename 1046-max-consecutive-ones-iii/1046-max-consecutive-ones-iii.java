class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int numlen=0;
        int zero=0;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            if(zero>k){
                if(nums[l]==0){
                    zero--;
                    
                }
                l++;
            }
            if(zero<=k){
                sum=r-l+1;
                numlen=Math.max(numlen,sum);
            }
            r++;
        }
        return numlen;
    }
}