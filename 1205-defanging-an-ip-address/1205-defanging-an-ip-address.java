class Solution {
    public String defangIPaddr(String address) {
        return defangIP(address);
    }

    private static String defangIP(String address) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char currentChar = address.charAt(i);
            if (currentChar == '.') {
                // Append "[.]" for every '.' character
                result.append("[.]");
            } else {
                // Append the character as is
                result.append(currentChar);
            }
        }

        // Convert StringBuilder back to String and return
        return result.toString();
    }
}