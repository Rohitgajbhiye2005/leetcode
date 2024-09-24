class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        
        while (i < n) {
            if (nums[i] % 2 == 0) {
                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;  
            }
            i++;  
        }
        
        return nums;
    }
}
