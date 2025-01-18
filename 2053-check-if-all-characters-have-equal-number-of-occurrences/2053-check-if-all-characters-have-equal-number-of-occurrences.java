

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        int frequency = -1;
        for (int count : mpp.values()) {
            if (frequency == -1) {
                frequency = count;
            } else if (frequency != count) {
                return false;
            }
        }

        return true;
    }
}
