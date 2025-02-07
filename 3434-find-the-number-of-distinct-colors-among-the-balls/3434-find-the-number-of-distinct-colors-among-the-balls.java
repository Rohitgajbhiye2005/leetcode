import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Set<Integer>> mpp = new HashMap<>();
        Map<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] it : queries) {
            int ball = it[0], color = it[1];

            if (!mp.containsKey(ball)) {
                mp.put(ball, color);
                mpp.computeIfAbsent(color, k -> new HashSet<>()).add(ball);
            } else {
                int c = mp.get(ball);
                mpp.get(c).remove(ball);
                if (mpp.get(c).isEmpty()) {
                    mpp.remove(c);
                }
                mp.put(ball, color);
                mpp.computeIfAbsent(color, k -> new HashSet<>()).add(ball);
            }
            ans.add(mpp.size());
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
