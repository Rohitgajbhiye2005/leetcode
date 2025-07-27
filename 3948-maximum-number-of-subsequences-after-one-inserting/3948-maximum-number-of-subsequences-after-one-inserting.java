class Solution {
    public long numOfSubsequences(String s) {
        int n = s.length();
        int[] pref = new int[n];
        int[] suff = new int[n];

        for (int i = 0; i < n; i++) {
            if (i > 0) pref[i] = pref[i - 1];
            if (s.charAt(i) == 'L') pref[i]++;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + 1 < n) suff[i] = suff[i + 1];
            if (s.charAt(i) == 'T') suff[i]++;
        }

        long ans = 0, best = 0, ansl = 0, anst = 0;

        for (int i = 0; i < n; i++) {
            long p = (i - 1 >= 0) ? pref[i - 1] : 0;
            long sf = (i + 1 < n) ? suff[i + 1] : 0;

            if (s.charAt(i) == 'C') {
                ans += p * sf;                  
                ansl += (p + 1) * sf;           
                anst += p * (sf + 1);           
            }

            p = pref[i];
            best = Math.max(best, p * sf);
        }
        return Math.max(ans + best, Math.max(ansl, anst));
    }
}
