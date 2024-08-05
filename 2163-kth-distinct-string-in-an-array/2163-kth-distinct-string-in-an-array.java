class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> distinctStrings = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            boolean isDistinct = true;
            
            for (int j = 0; j < arr.length; j++) {
                if (i != j && current.equals(arr[j])) {
                    isDistinct = false;
                    break;
                }
            }
            
            if (isDistinct) {
                distinctStrings.add(current);
            }
        }
        
        if (k <= distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }
}