class Solution {
    public int characterReplacement(String s, int k) {
        
       

        char[] chars = s.toCharArray();
        int[] count = new int[128];
        int maxCount = 0;
        int res =0;
        int left = 0, right =0;
        int n = s.length();
        while(right<n){
            count[chars[right]]++;
            maxCount = Math.max(maxCount, count[chars[right]]);
            right++;
            if(right-left-maxCount <= k) res = Math.max(res, right-left);
            while(right-left-maxCount >k){
                count[chars[left++]]--;
            }
            
        }
        return res;

    }
}