class Solution {
    public int majorityElement(int[] nums) {
     int cnt=0;
     int el=0;
     for(int i=0;i<nums.length;i++){
        if(cnt==0){
            cnt=1;
            el=nums[i];
        }
        else if(nums[i]==el){
            cnt++;
        }
        else{
            cnt--;
        }
     } 
     int cnt1=0;
     for(int i=0;i<nums.length;i++){
       if( nums[i]==el)
        cnt1++;
     }  
     if(cnt1>(nums.length/2)){
        return el;
     }
    return -1;
    }
}