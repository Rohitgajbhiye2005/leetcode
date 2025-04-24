import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        Set<Integer>distinct=new HashSet<>();
        for(int num:nums){
            distinct.add(num);
        }
        int height=distinct.size();
        for(int i=0;i<n;i++){
            Set<Integer>subset=new HashSet<>();
            for(int j=i;j<n;j++){
                subset.add(nums[j]);
                 if(subset.size()==height){
                cnt++;
            }
            }
           
        }
       return cnt;
    }
}
