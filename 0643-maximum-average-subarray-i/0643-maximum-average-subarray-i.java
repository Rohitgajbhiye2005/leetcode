class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, start = 0;
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k - 1) {
                double avg = (double) sum / k;
                max = Math.max(max, avg);
                sum -= nums[start];
                start++;
            }
        }
        return max;
    }
}