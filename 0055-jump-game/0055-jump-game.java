class Solution {
    public boolean canJump(int[] nums) {
       int maxindex=0;
       for(int i=0;i<nums.length;i++){
        if(i>maxindex) return false;
        maxindex=Math.max(maxindex,i+nums[i]);
       } 
       return true;
    }
}