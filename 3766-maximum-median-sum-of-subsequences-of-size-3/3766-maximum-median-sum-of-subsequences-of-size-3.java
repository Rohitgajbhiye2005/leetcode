import java.util.*;
class Solution {
    public long maximumMedianSum(int[] nums) {
     Arrays.sort(nums);
     long sum=0;
     int n=nums.length;
     for(int i=0;i<n/3;i++){
        sum+=nums[n-2-2*i];
     }  
     return sum;
    }
}