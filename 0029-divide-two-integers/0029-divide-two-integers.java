class Solution {
    public int divide(int dividend, int divisor) {
        int res=(int)(dividend/divisor);
        if(res>Integer.MIN_VALUE && res<=Integer.MAX_VALUE){
        return res;
        }
        else{
            if(divisor==1){
                return dividend;
            }
            
        }
        return Integer.MAX_VALUE;
    }
}