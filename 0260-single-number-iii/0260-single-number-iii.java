class Solution {
    public int[] singleNumber(int[] nums) {
        int Xor = 0;
        for (int i = 0; i < nums.length; i++) {
            Xor = Xor ^ nums[i];
        }
        int rightmost = Xor & -Xor;
        int b1 = 0;
        int b2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & rightmost) != 0) {
                b1 = b1 ^ nums[i];
            } else {
                b2 = b2 ^ nums[i];
            }
        }
        return new int[]{b1, b2};
    }
}