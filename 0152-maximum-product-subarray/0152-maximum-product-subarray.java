class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        double pre = 1;
        double suf = 1;

        for (int i = 0; i < n; i++) {
            
            if (pre == 0) {
                pre = 1;
            }
            
            if (suf == 0) {
                suf = 1;
            }

            
            pre *= nums[i];
            
            suf *= nums[n - i - 1];

            
            max = Math.max(max, (int)Math.max(pre, suf));
        }

        return max;
    }
}