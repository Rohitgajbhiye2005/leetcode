class Solution {
    public int subarraySum(int[] nums, int k) {
         int cnt = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        int presum = 0;

        mpp.put(0, 1); 

        for (int i = 0; i < nums.length; i++) {
            presum += nums[i]; 
            int remove = presum - k;

            
            cnt += mpp.getOrDefault(remove, 0);

            
            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
        }

        return cnt;
       
       
    }
}