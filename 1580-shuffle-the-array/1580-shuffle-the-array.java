class Solution {
    public int[] shuffle(int[] nums, int n) {
        int one=0;
        int two=n;
        int[] myArray;
        myArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            myArray[i++]=nums[one++];
            myArray[i]=nums[two++];
            
        }
        return myArray;
    }
}