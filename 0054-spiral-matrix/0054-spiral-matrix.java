class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer>matric=new ArrayList<>();
        int top=0,left=0,bottom=n-1,right=m-1;
        
        while(top<=bottom && left <=right){
        for(int i=left;i<=right;i++){
            matric.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            matric.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            matric.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            matric.add(matrix[i][left]);
        }
        left++;
    }
        }

        return matric;
    }
}