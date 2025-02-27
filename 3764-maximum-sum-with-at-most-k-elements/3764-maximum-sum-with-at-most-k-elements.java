class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        List<Integer> list=new ArrayList<>();
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        for(int i=0;i<limits.length;i++)
            {
                int[] arr=grid[i];
                int limit=limits[i];
                int count=0;
                for(int j=arr.length-1;j>=0 && count<limit;j--)
                    {
                        list.add(arr[j]);
                        count++;
                    }
            
        }
        Collections.sort(list);
        k=Math.min(list.size(),k);
        long sum=0;
        for(int i=list.size()-k;i<list.size();i++)
            {
                sum+=list.get(i);
            }
        return sum;
    }
}