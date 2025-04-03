class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        int[] prefix_max = new int[n];
        prefix_max[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_max[i] = Math.max(prefix_max[i - 1], nums[i]);
        }

        int[] suffix_max = new int[n];
        suffix_max[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix_max[i] = Math.max(suffix_max[i + 1], nums[i]);
        }

        long ans = 0;
        for (int j = 1; j < n - 1; j++) {
            long value = (long)(prefix_max[j - 1] - nums[j]) * suffix_max[j + 1];
            ans = Math.max(ans, value);
        }

        return ans;
    }
}
