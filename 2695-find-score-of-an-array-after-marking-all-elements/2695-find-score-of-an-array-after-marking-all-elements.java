class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];
        long score = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); 
            }
            return Integer.compare(a[1], b[1]); 
        });

       
        for (int i = 0; i < n; i++) {
            minHeap.add(new int[]{nums[i], i});
        }

      
        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            int value = element[0];
            int index = element[1];

           
            if (marked[index]) {
                continue;
            }

         
            score += value;

            
            marked[index] = true;
            if (index > 0) {
                marked[index - 1] = true;
            }
            if (index < n - 1) {
                marked[index + 1] = true; 
            }
        }

        return score;
    }
}