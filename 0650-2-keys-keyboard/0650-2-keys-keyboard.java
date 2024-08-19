class Solution {
    public int minSteps(int n) {
        int operations = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                operations += i;
                n /= i;
            }
        }
        return operations;
    }
}