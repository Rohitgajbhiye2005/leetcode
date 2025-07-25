class Solution {
    public int maxSum(int[] nums) {
      int sum=0;
      int maxi=Integer.MIN_VALUE;
      boolean isneg=true;
      for(int num:nums){
        if(num>=0){
            isneg=false;
        }
        if(num>maxi){
            maxi=num;
        }
      }
      if(isneg){
        return maxi;
      }
      HashSet<Integer>set=new HashSet<>();
      for(int num:nums){
        set.add(num);
        }  
        for (int val:set){
        if(val>0){
            sum+=val;
        }
    }
    
    return sum;
    }

}