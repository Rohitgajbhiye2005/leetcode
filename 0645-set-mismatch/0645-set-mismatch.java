class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> unqNums = new HashSet<>();
        int res[] = new int[2];
        for(var num : nums){
            if(unqNums.contains(num)){
                res[0] = (num);
            }
            unqNums.add(num);
        }
        for(int num = 1; num <= nums.length; num++){
            if(!unqNums.contains(num))res[1] = (num);
        }
        return res;
    }
}