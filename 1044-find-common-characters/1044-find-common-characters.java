import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Loop through each character from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int minCount = Integer.MAX_VALUE;
            
            // Count occurrences of the current character in each word
            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }
            
            // Add the character to the result list the required number of times
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(ch));
            }
        }
        
        return result;
    }
}
