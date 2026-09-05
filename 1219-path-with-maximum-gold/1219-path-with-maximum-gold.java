class Solution {
    int[][] grid;
    int row,col;
    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        row = grid.length;
        col = grid[0].length;

        int ans = 0;

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]!=0){
                    ans = Math.max(ans,dfs(i,j));
                }
            }
        }
        return ans;
    }
    private int dfs(int r,int c){
        int gold = grid[r][c];
        grid[r][c] = 0;
        int maxnext =0;

        if(r>0 && grid[r-1][c]!=0){
            maxnext = Math.max(maxnext,dfs(r-1,c));
        }
        if(c>0 && grid[r][c-1]!=0){
            maxnext = Math.max(maxnext,dfs(r,c-1));
        }
        if(r<row-1 && grid[r+1][c]!=0){
            maxnext = Math.max(maxnext,dfs(r+1,c));
        }
        if(c<col-1 && grid[r][c+1]!=0){
            maxnext = Math.max(maxnext,dfs(r,c+1));
        }
        
        grid[r][c] = gold;
        return gold + maxnext;
    }
}