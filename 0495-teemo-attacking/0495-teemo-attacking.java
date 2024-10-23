class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int startTime = timeSeries[0];
        int endTime = startTime + duration;
        for (int i = 1; i < timeSeries.length; i++) {
            int time = timeSeries[i];
            if (time > endTime) {
                total += endTime - startTime;
                startTime = time;
            }
            endTime = time + duration;
        }
        return total + (endTime - startTime);
    }
}