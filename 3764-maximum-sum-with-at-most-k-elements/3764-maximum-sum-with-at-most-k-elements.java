class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        if(grid.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> temp;
        for(int i = 0; i< grid.length; i++) {
            temp = new PriorityQueue<>(Collections.reverseOrder());
            for(int j = 0; j < grid[i].length; j++) {
                temp.add(grid[i][j]);
            }
            int cnt = 0;
            while(!temp.isEmpty() && cnt < limits[i]) {
                pq.add(temp.poll());
                cnt+=1;
            } 
        }
        long result = 0, count = 0;
        while(!pq.isEmpty() && count < k) {
            result+=pq.poll();
            count+=1;
        }
        return result; 
    }
}