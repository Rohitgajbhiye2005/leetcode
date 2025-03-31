class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int total=n*n*w;
        if(total>maxWeight){
            while(total>maxWeight){
                total=total-w;
            }
        }
        return total/w;
    }
}