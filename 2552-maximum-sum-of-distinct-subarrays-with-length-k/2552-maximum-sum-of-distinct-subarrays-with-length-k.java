import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maxi = 0;
        int l = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            if (r - l + 1 == k) {
                if (freq.size() == k) {
                    maxi = Math.max(maxi, sum);
                }
                sum -= nums[l];
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) freq.remove(nums[l]);
                l++;
            }
        }
        return maxi;
    }
}