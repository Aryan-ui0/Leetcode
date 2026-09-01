class Solution {
    int ans = 0;
    private void backtrack(char[][] board,int row,int n){
        if(row==n){
            ans++;
            return;
        }
        for(int cols = 0;cols<n;cols++){
            if(issafe(board,row,cols,n)){
                board[row][cols] = 'Q';
                backtrack(board,row+1,n);
                board[row][cols] = '.';

            }
        }
    }
    private boolean issafe(char[][] board,int row,int cols,int n){
        for(int i = 0;i<row;i++){
            if(board[i][cols]=='Q') return false;
        }
        for(int i =row-1, j =cols-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i = row-1,j = cols+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(board,0,n);
        return ans;

    }
}