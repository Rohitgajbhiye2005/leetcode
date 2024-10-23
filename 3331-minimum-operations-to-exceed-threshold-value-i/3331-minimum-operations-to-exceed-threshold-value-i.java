class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<k){
                cnt++;;
            }
        }
        return cnt;
    }
}