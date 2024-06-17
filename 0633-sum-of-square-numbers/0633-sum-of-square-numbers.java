class Solution {
    public boolean judgeSquareSum(int c) {
        for (int a = 0; a <= Math.sqrt(c); a++) {
            int aSquared = a * a;
            int bSquared = c - aSquared;
            int b = (int) Math.sqrt(bSquared);
            if (b * b == bSquared) {
                return true;
            }
        }
        return false;
    }
    }
