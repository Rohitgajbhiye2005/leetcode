class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> sb=new HashSet<>();
        int n=A.length;
        int cnt=0;int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(!s.contains(A[i])){
                s.add(A[i]);
                if(sb.contains(A[i]))
                cnt++;
            }
            
            if(!sb.contains(B[i])){
            sb.add(B[i]);
            if(s.contains(B[i]))
            cnt++;

            }
            ans[i]=cnt;

        }
        return ans;
    }
}