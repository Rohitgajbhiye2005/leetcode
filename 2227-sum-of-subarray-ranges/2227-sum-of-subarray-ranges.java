class Solution {
        public long subArrayRanges(int[] nums) {
            return getSum(nums,false)-getSum(nums,true);
        }

        private long getSum(int[] nums, boolean min){
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int n = nums.length;
            long sum = 0L;
            for(int i = 0; i <= n; i++){
                while (stack.peek()!=-1 && (i==n || (min && nums[stack.peek()]>nums[i]) || (!min && nums[stack.peek()]<nums[i]))){
                    int pos = stack.pop();
                    int v = nums[pos];
                    long dist = (i-pos)*(pos-stack.peek());
                    sum += dist*v;
                }
                stack.push(i);
            }
            return sum;
        }
    }