class Solution {
    public int islandPerimeter(int[][] grid) {
        int totalPerimeter=0;
        for(int row=0;row<grid.length;row++){
             for(int col=0;col<grid[row].length;col++){

                if(grid[row][col]==1){
                    int x=4;

                    
                    if(col-1>=0 && grid[row][col-1]==1){
                            x--;
                    }
                     
                     if(col+1<grid[row].length && grid[row][col+1]==1){
                            x--;
                    }
                    
                    if(row-1>=0 && grid[row-1][col]==1){
                        x--;
                    }
              
                     if(row+1<grid.length && grid[row+1][col]==1){
                        x--;
                    }

                    totalPerimeter=totalPerimeter+x;
                }
             }
        }
        return totalPerimeter;
    }
}