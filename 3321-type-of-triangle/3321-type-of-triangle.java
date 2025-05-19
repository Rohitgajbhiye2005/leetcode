class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
    
        int pos=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
                pos=i;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(i!=pos){
                sum+=nums[i];
            }
        }
        if(sum<=max){
            return "none";
        }
        else if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }else if((nums[0]==nums[2] && nums[1]!=nums[2])||(nums[0]==nums[1] && nums[1]!=nums[2]) || (nums[0]!=nums[1] && nums[1]==nums[2]) ){
            return "isosceles";
        }
        return "scalene";
        
    }
}