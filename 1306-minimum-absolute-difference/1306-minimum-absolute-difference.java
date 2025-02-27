class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
            mini=Math.min(mini,arr[i]-arr[i-1]);
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1] == mini)
            {
                List<Integer> li=new ArrayList<>();
                li.add(arr[i-1]);
                li.add(arr[i]);
                ans.add(li);
            }
        }
        return ans;
    }
}