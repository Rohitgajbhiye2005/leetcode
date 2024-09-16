class Solution {
    public int trap(int[] nums) {
        int n=nums.length;
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=n-1;
        int total=0;
        while(l<r){
            if(nums[l]<=nums[r]){
                if(lmax<=nums[l]){
                    
                    lmax=nums[l];
                }
                else{
                    total+=lmax-nums[l];
                }
                l++;
            }
            else{
                if(rmax>nums[r]){
                    total+=rmax-nums[r];
                }
                else{
                    rmax=nums[r];
                }
                r--;
            }
        }
        return total;
    }
}