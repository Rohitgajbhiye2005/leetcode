class Solution {
    public int minSubarray(int[] nums, int p) {
       int totalsum=0;
       for(int num:nums){
        totalsum=(totalsum+num)%p;
       }
       if(totalsum==0) return 0;
       HashMap<Integer,Integer> res=new HashMap<>();
       res.put(0,-1);
        int currsum=0;
        int minlength=nums.length;
        for(int i=0;i<nums.length;i++){
            currsum=(currsum+nums[i])%p;
            int target=(currsum-totalsum+p)%p;
            if(res.containsKey(target)){
                minlength=Math.min(minlength,i-res.get(target));
            }
            res.put(currsum,i);
        }
        return minlength==nums.length?-1:minlength;
    }
}