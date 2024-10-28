class Solution {
    public int mod=1000000007;
    public int countGoodNumbers(long n) {
        
        return (int) (mypow(5,(n+1)/2) * (mypow(4,n/2)) %mod);
    }
    private long mypow(long base, long exponent) {
        long result = 1; 
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                
                result = (result * base) % mod;
            }
           
            base = (base * base) % mod;
            exponent >>= 1; 
        }
        return result;
    }
}