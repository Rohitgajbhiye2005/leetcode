class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1, high = findMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid; 
            } else {
                low = mid + 1; 
            }
        }
        return low;
    }

    private int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;

       
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }

    private int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;

        for (int i = 0; i < n; i++) {
            totalH += (piles[i] + hourly - 1) / hourly; 
        }
        return totalH;
    }
    
    

}