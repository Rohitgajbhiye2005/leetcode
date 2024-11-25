class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>[] dp = new ArrayList[target + 1];
        for (int i = 0; i <= target; i++) {
            dp[i] = new ArrayList<>();
        }
        dp[0].add(new ArrayList<>());

        for (int i = 1; i <= target; i++) {
            for (int candidate : candidates) {
                if (candidate <= i) {
                    for (List<Integer> prev : dp[i - candidate]) {
                        List<Integer> temp = new ArrayList<>(prev);
                        temp.add(candidate);
                        temp.sort(Integer::compareTo);
                        if (!dp[i].contains(temp)) {
                            dp[i].add(temp);
                        }
                    }
                }
            }
        }
        return dp[target];
    }
}