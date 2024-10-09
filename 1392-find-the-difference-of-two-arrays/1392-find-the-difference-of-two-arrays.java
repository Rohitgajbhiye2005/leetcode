class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> uniqueToNums1 = new ArrayList<>();
        List<Integer> uniqueToNums2 = new ArrayList<>();
        
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        
        for (int i : nums1) {
            first.add(i);
        }
        for (int i : nums2) {
            second.add(i);
        }
        
        for (int i : first) {
            if (!second.contains(i)) {
                uniqueToNums1.add(i);
            }
        }

        for (int i : second) {
            if (!first.contains(i)) {
                uniqueToNums2.add(i);
            }
        } 
        
        ans.add(uniqueToNums1);
        ans.add(uniqueToNums2);
        
        return ans;
    }
}
