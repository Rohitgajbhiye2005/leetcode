class Solution {
    private static final int MOD = 1000000007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> sub = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sub.add(sum);
            }
        }
        Collections.sort(sub);
        long res=0;
        for(int i=left-1;i<right;i++){
            res+=sub.get(i);
            res%=MOD;
        }
        return (int)res;
    }
}