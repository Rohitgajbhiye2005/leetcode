class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left=0;
        int right=x;
        while(left<=right){
            int mid=(left+right)/2;
            long square=(long) mid*mid;
            if(x==square){
                return mid;
            }
            else if(x>square){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return right;
    }
}