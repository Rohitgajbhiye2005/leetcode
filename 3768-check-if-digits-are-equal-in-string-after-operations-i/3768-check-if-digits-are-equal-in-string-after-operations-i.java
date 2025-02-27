class Solution {
    public boolean hasSameDigits(String s) {
      int n = s.length();

        int chs[] = new int[n];

        for (int i = 0; i < n; i++) {
            chs[i] = s.charAt(i) - '0';
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n - i; j++) {
                chs[j - 1] = (chs[j - 1] + chs[j]) % 10;
            }
        }

        return chs[0] == chs[1];  
    }
}