import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if (sb.length() > 0) {
            
                st.push(sb.toString());
                sb.setLength(0); 
            }
        }

        
        if (sb.length() > 0) {
            st.push(sb.toString());
        }

      
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
            if (!st.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
