class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans= new int[n];
        if(k==0){
            return ans;
        }
        else if(k>0){
            for(int i=0; i<n; i++){
                int s=0;
                for(int j=1; j<=k; j++){
                    s+=code[(i+j)%n];
                }
                ans[i]=s;
            }
            return ans;
        }
        else{
            for(int i=0; i<n; i++){
                int s=0;
                for(int j=1; j<=-k; j++){
                    s+=code[(i-j+n)%n];
                }
                ans[i]=s;
            }
            return ans;
        }
    }
}