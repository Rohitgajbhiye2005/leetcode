class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] prefixCommonArray = new int[n];

        Set<Integer> elementsInA = new HashSet<Integer>();
        Set<Integer> elementsInB = new HashSet<Integer>();

        for (int currentIndex = 0; currentIndex < n; ++currentIndex) {
        
            elementsInA.add(A[currentIndex]);
            elementsInB.add(B[currentIndex]);

            int count = 0;

            for (int element : elementsInA) {
                if (elementsInB.contains(element)) {
                    ++count;
                }
            }

            
            prefixCommonArray[currentIndex] = count;
        }

        // Return the final array with counts of common elements in each prefix
        return prefixCommonArray;
    }
}