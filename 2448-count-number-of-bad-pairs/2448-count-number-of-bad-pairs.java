class Solution {
    public long countBadPairs(int[] nums) {
     int n = nums.length;
        long cnt = (long) n * (n - 1) / 2;

        
        for (int i = 0; i < n; i++) {
            nums[i] -= i;
        }

        Arrays.sort(nums);

        
        for (int l = 0, r = 0; r < n; ) {
            int x = nums[l];
            while (r < n && nums[r] == x) {
                r++;
            }
            long freq = r - l;
            cnt -= freq * (freq - 1) / 2;
            l = r;
        }

        return cnt;
    }
}