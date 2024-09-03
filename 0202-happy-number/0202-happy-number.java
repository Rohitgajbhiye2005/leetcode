class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int a = n;
        int b;
        if(n==2||n==3||n==4){
            return false;
        }else{
            while(a!=0){
                b=a%10;
                sum = sum+(b*b);
                a/=10;
            }
            if(sum==1){
                return true;
            }
            return isHappy(sum);
        }
    }
}