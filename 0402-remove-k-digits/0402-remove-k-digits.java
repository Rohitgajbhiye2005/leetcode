class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        String result = "";
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && (num.charAt(i)-'0')<(st.peek()-'0')){
                st.pop();
                k-=1;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k-=1;
        }
        if(st.isEmpty()){
            return "0";
        }
        while(!st.isEmpty()){
            result+=st.pop();
        }
        String res = "";
        int index;
        for(index=result.length()-1;index>0;index--){
            if(result.charAt(index)!='0'){
                break;
            }
        }
        for(int i=index;i>=0;i--){
            res+=result.charAt(i);
        }
        return res;

    }
}