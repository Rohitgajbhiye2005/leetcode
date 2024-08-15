class Solution {
    public boolean lemonadeChange(int[] nums) {
        int n=nums.length;
        int cnt5=0;
        int cnt10=0;
       
        for(int i=0;i<n;i++){
            if(nums[i]==5){
                ++cnt5;
            }else if(nums[i]==10){
                --cnt5;
                ++cnt10;
            }else{
                if(cnt10>0){
                    --cnt10;
                    --cnt5;
                }else{
                    cnt5-=3;
                }
            }
            if(cnt5<0){
                return false;
            }
            
        }
        return true;
    }
}