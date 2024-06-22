class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int cnt = 0;
        int oddCount = 0;
        int result = 0; 

        while (r < n) {
            if (nums[r] % 2 == 1) {
                oddCount++;
                cnt = 0;
            }
            
            while (oddCount == k) {
                cnt++;
                if (nums[l] % 2 == 1) {
                    oddCount--;
                }
                l++;
            }
            
            result += cnt;
            r++;
        }
        
        return result;
    }
}
