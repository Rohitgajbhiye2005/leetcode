class Solution {
    public int countSubarrays(int[] nums) {
      int cnt=0;
      int n=nums.length;
      for(int i=0;i<n-2;i++){
        int a=nums[i];
        int b=nums[i+1];
        int c=nums[i+2];
        if((2*(a+c))==b){
            cnt++;
        }
      }  
      return cnt;
    }
}