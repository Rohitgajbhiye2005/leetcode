class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findFirst(nums, target);
        int lastPos = findLast(nums, target);
        return new int[]{firstPos, lastPos};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstPos = mid;
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstPos;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastPos = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastPos = mid;
                left = mid + 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastPos;
    }
}
