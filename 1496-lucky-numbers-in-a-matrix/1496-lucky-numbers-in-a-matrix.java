import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        int[] minInRow = new int[m];
        for (int i = 0; i < m; i++) {
            int minVal = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }
            minInRow[i] = minVal;
        }
        
     
        int[] maxInCol = new int[n];
        for (int j = 0; j < n; j++) {
            int maxVal = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                }
            }
            maxInCol[j] = maxVal;
        }
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        
        return result;
    }
}
