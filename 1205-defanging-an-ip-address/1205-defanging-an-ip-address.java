class Solution {
    public String defangIPaddr(String address) {
        return defangIP(address);
    }

    private static String defangIP(String address) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char currentChar = address.charAt(i);
            if (currentChar == '.') {
                
                result.append("[.]");
            } else {
               
                result.append(currentChar);
            }
        }

        
        return result.toString();
    }
}