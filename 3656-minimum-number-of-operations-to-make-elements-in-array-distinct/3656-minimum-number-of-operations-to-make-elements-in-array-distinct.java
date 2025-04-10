
public class Solution{
public int minimumOperations(int[] nums) {
         int start = 0;
         int operations = 0;
        
         while (start < nums.length) {
             if (isDistinct(nums, start)) {
                 return operations;
             }
             operations++;
             start += 3; 
         }
         return operations;
     }

     private boolean isDistinct(int[] nums, int start) {
         HashSet<Integer> set = new HashSet<>();
         for (int i = start; i < nums.length; i++) {
             if (!set.add(nums[i])) { 
                 return false;
             }
         }
         return true;
     }
}