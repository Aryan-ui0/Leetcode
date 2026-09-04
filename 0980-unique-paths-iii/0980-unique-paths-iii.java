class Solution {
    int count = 0;
    private void backtrack(int[][] grid,int i,int j,int cellsleft){
        if(grid[i][j]==2){
            if(cellsleft == 0){
                count++;
            }
            return;
        }
        grid[i][j] = -1;

        if(i-1>=0 && grid[i-1][j]!=-1){
            backtrack(grid,i-1,j,cellsleft-1);
        }
        if(i+1<grid.length && grid[i+1][j]!=-1){
            backtrack(grid,i+1,j,cellsleft-1);
        }
        if(j-1>=0 && grid[i][j-1]!=-1){
            backtrack(grid,i,j-1,cellsleft-1);
        }
        if(j+1<grid[0].length && grid[i][j+1]!=-1){
            backtrack(grid,i,j+1,cellsleft-1);
        }
        grid[i][j] =0;
    }
    public int uniquePathsIII(int[][] grid) {
        int cellsleft =0;
        int startrow =0;
        int startcol =0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0) cellsleft++;
                if(grid[i][j]==1){
                    startrow =i;
                    startcol =j;
                }
            }
        }


        backtrack(grid,startrow,startcol,cellsleft+1);
        
        return count;
    }
}