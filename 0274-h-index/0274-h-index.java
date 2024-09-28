class Solution {
    public int hIndex(int[] nums) {
        int hi=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(nums[i]>=h){
                hi=h;
                break;
            }
        }
        return hi;
    }
}