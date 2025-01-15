class Solution {

    private int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }

    public int minimizeXor(int num1, int num2) {
        int num2SetBits = countSetBits(num2);  
        int num1SetBits = countSetBits(num1);  
        
        int result = num1;
        
        int currentSetBits = countSetBits(result);
        if (currentSetBits < num2SetBits) {
        
            int i = 0;
            while (currentSetBits < num2SetBits) {
                if (((result >> i) & 1) == 0) {
                    result |= (1 << i);  
                    currentSetBits++;
                }
                i++;
            }
        } else if (currentSetBits > num2SetBits) {
           
            int i = 0;
            while (currentSetBits > num2SetBits) {
                if (((result >> i) & 1) == 1) {
                    result &= ~(1 << i);  
                    currentSetBits--;
                }
                i++;
            }
        }

        return result;
    }
}
