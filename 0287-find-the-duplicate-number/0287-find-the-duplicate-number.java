class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        boolean map[] = new boolean[n];

     for(int num : nums){
        if(map[num]){
            return num;
        }else{
            map[num] = true;
        }
     }   
     return -1;
    }
}