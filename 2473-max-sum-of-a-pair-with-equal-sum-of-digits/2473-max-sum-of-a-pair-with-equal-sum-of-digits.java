class Solution {
   public int maximumSum(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = -1;

        for (int num : nums) {
            int digitSum = sum(num);

            if (map.containsKey(digitSum)) {
                maxi = Math.max(maxi, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num)); 
            } else {
                map.put(digitSum, num);
            }
        }

        return maxi;
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}