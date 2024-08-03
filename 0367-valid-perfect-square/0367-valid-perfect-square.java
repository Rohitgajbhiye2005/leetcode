class Solution {
    public boolean isPerfectSquare(int num) {
       int right=num;
       int left=0;
       while(left<=right){
        int mid=(left+right)/2;
        long square=(long) mid*mid;
        if(num==square){
            return true;
        }
        else if(num>square){
            left=mid+1;
        }
        else{
            right=mid-1;
        }

       }
       return false;

    }
}