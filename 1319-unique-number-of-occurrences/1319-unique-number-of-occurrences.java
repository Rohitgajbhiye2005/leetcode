import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> freqList = new ArrayList<>(freqMap.values());
        Collections.sort(freqList);
        
        for (int i = 1; i < freqList.size(); i++) {
            if (freqList.get(i).equals(freqList.get(i - 1))) {
                return false;
            }
        }
        
        return true;
    }
}
