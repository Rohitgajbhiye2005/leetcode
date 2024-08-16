class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int first = array.get(0);
            int last = array.get(array.size() - 1);
            maxDistance = Math.max(maxDistance, Math.abs(last - minVal));
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - first));
            minVal = Math.min(minVal, first);
            maxVal = Math.max(maxVal, last);
        }
        
        return maxDistance;
    }
}