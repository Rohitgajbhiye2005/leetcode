class Solution {
    public int maxAscendingSum(int[] nums) {
       int sum=0;
       for(int i=0;i<nums.length;i++){
        int cur=nums[i];
        for(int j=i+1;j<nums.length && nums[j]>nums[j-1];j++){
            
            cur+=nums[j];
        }
        sum=Math.max(sum,cur);
       } 
       return sum;
    }
}