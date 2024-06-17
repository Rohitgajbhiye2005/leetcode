class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        
        while (left <= right) {
            long sumOfSquares = (long)left * left + (long)right * right;
            if (sumOfSquares == c) {
                return true;
            } else if (sumOfSquares < c) {
                left++;
            } else {
                right--;
            }
        }
        
        return false;
    }
}
