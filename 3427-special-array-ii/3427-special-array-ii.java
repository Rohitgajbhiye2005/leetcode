class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] mismatch = new int[n]; 

       
        for (int i = 0; i < n - 1; i++) {
            mismatch[i] = (nums[i] % 2) == (nums[i + 1] % 2) ? 1 : 0;
        }

      
        int[] prefixSum = new int[n];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + mismatch[i - 1];
        }

        boolean[] res = new boolean[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int st = queries[k][0];
            int end = queries[k][1];
            res[k] = (prefixSum[end] - prefixSum[st]) == 0;
        }

        return res;
    }
}