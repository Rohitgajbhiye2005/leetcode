class Solution {
    public int[] rearrangeArray(int[] nums) {
       int []num;
       int pos=0;
       int neg=1;
       num=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                num[pos]=nums[i];
                pos+=2;
            }
            else{
                num[neg]=nums[i];
                neg+=2;
            }
        }
        return num;
    }
}