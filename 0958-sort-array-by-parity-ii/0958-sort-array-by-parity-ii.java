class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int oddpos=1;
        int evenpos=0;
        int right=0;
        for( right=0;right<n;right++){
            if(nums[right]%2==0){
                arr[evenpos]=nums[right];
                evenpos+=2;
            }
            else{
                 arr[oddpos]=nums[right];
                 oddpos+=2;
            }
        }
        return arr;
    }
}