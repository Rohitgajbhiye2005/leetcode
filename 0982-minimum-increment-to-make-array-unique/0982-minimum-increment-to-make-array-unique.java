class Solution {
    public int minIncrementForUnique(int[] nums) {
      int sum=0;
      int min=0;
      Arrays.sort(nums);
      for(final int num:nums){
        sum+=Math.max(min-num,0);
        min=Math.max(min,num)+1;
      }  
      return sum;
    }
}