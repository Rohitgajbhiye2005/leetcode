class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] sorted=new int [score.length];
        String [] ans=new String [score.length];
        for(int i=0;i<score.length;i++){
            sorted[i]=score[i];
        }
        Arrays.sort(sorted);
        int j=1;
        for(int i=score.length-1;i>=0;i--){
            int place=score.length-binarySearch(sorted,score[i]);
            if(place==1){
                ans[i]="Gold Medal";
            }
            else if(place==2){
                ans[i]="Silver Medal";
            }
            else if(place==3){
                ans[i]="Bronze Medal";
            }
            else{
                ans[i]=String.valueOf(place);
            }
        }
        return ans;
    }

    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
           
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                
                low = mid + 1;
            } else {
             
                high = mid - 1;
            }
        }
        
        
        return -1;
    }
}