import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        int[] ans = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (map.get(A[i]) == 2) {
                cnt++;
            }

            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            if (map.get(B[i]) == 2) {
                cnt++;
            }

            ans[i] = cnt;
        }

        return ans;
    }
}
