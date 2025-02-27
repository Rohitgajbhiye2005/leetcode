class Solution {
    public int minDeletion(int[] nums) {
         Stack<Integer> st=new Stack<>();
        int k=0;
        st.push(nums[0]);
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==st.peek() && k%2==0)
            {
                count++;
                continue;
            }
            else{
                st.push(nums[i]);
                k++;
            }
        }
        if(st.size()%2==1) return count+1;
        return count;
    }
}