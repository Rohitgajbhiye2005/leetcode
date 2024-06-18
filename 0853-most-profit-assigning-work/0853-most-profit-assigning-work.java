class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       int sum=0;
       int d=difficulty.length;
       int w=worker.length;
       int p=profit.length;
       
        for(int i=0;i<w;i++){
            int max=0;
            for(int j=0;j<d;j++){
                if(difficulty[j]<=worker[i]){
                     max = Math.max(max, profit[j]);
                }
            }
            sum+=max;
        }
        return sum;
    }
}