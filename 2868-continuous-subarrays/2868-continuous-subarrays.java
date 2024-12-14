import java.util.*;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        long ans = 0;
        int l = 0;

        for (int r = 0; r < n; ++r) {
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[r]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(r);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[r]) {
                minDeque.pollLast();
            }
            minDeque.addLast(r);

            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > 2) {
                if (maxDeque.peekFirst() == l) maxDeque.pollFirst();
                if (minDeque.peekFirst() == l) minDeque.pollFirst();
                l++;
            }

            ans += (r - l + 1);
        }

        return ans;
    }
}
