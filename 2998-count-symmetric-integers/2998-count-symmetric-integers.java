class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            if (i < 100 && i % 11 == 0) {
                ans++;
            } else if (i >= 1000 && i < 10000) {
                int right = i % 100;
                int left = i / 100;
                int rightSum = (right % 10) + (right / 10);
                int leftSum = (left % 10) + (left / 10);
                if (rightSum == leftSum) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
