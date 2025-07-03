class Solution {
    public int search(int[] arr, int x) {
        int n=arr.length;
        int k=0;
        for(int i=n/2;i>=1;i/=2){
            while((i+k)<n && arr[i+k]<=x){
                k+=i;
            }
        }
        if(arr[k]==x){
            return k;
        }
        return -1;
    }
}