class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        Map<Integer, Integer> ballMap = new HashMap<>();
        Map<Integer, Integer> colorMap = new HashMap<>();
        int[] result = new int[queries.length];
        int index = 0;

        for (int[] query : queries) {
            colorMap.put(query[1], colorMap.getOrDefault(query[1], 0) + 1);
            if (ballMap.containsKey(query[0])) {
                int color = ballMap.get(query[0]);
                int val = colorMap.get(color);
                if (val == 1)
                    colorMap.remove(color);
                else
                    colorMap.put(color, val - 1);
            }
            ballMap.put(query[0], query[1]);
            result[index++] = colorMap.size();
        }
        return result;
    }
}