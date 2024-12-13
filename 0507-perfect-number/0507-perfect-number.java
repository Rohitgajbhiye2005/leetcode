class Solution {
    public boolean checkPerfectNumber(int num) {
        int count = num;
    for(int i = 1; i<num; i++)
    if(num%i==0){
        count -=i;
     }
     return count==0;
    }
}