class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x < y){
            int temp = x;
            x = y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }

        int a=0, b=0, total = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == 'a')
                a++;
            else if(c == 'b'){
                if(a > 0){
                    a--;
                    total += x;
                }
                else
                    b++;
            }
            else{
                total += Math.min(a,b)*y;
                a = b =0;
            }
        }
        
        total += Math.min(a,b)*y;
        return total;
    }
}