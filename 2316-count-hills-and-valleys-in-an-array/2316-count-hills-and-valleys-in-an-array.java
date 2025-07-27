class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int cnt=0;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                list.add(nums[i]);
            }
        }
        for(int i=1;i<list.size()-1;i++){
            int prev=list.get(i-1);
            int curr=list.get(i);
            int next=list.get(i+1);
            if((curr>prev && curr>next) || (curr<prev && curr<next)){
                cnt++;
            }
        }
        return cnt;
    }
}