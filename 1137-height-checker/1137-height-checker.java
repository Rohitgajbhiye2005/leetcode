class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int number=0;
        int [] res=new int[heights.length];
        for(int i=0;i<n;i++){
            res[i]=heights[i];
        }
        Arrays.sort(res);
        for(int i=0;i<n;i++){
            if(heights[i]!=res[i]){
                number++;
            }
        }
        return number;
    }
}