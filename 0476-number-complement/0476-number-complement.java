class Solution {
    public int findComplement(int num) {
        int result = 0;
        int bitPosition = 0;
        
        while (num > 0) {
            
            if ((num & 1) == 0) {
           
                result += 1 << bitPosition;
            }
            
            num >>= 1;
            bitPosition++;
        }
        
        return result;
    }
}
