import java.util.Arrays;
class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            //reverse(nums,0,n-1);
            int left=0;
            int right=n-1;
            while(left<right){
                int tem=nums[left];
                nums[left]=nums[right];
                nums[right]=tem;
                right--;
                left++;
            }
            return ;
        }
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                 nums[i]=nums[index];
                nums[index]=temp;
                break;
            }

        }
        //reverse(nums,index+1,n-1);
        int left=index+1;
        int right=n-1;
      while(left< right){
            int tem=nums[left];
            nums[left]=nums[right];
            nums[right]=tem;
            left++;
            right--;
        }
        return ;
    }
}