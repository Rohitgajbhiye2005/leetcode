class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
          Arrays.sort(g);
        Arrays.sort(s);
        int left=0,right=0;
        while(left<g.length && right<s.length){
            if(g[left]<=s[right]){
                left++;
            }
           right++;
        } 
       return left;
    }
}