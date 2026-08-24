class Solution {
    List<List<String>> res = new ArrayList<>();
    private void nqueens(char[][] board ,int row,int n){
        if(row==n){
            List<String> curr = new ArrayList<>();
            for(int i =0;i<n;i++){
                curr.add(new String(board[i]));
            }
            res.add(curr);
            return;
        }
        for(int j = 0;j<n;j++){
            if(issafe(row,j,board,n)){
                board[row][j]= 'Q';
                nqueens(board,row+1,n);
                board[row][j] = '.';
            }
        }
    }
    private boolean issafe(int row,int j,char[][] board,int n){
        for(int i = 0;i<row;i++){
            if(board[i][j]== 'Q') return false;
        }
        for(int i = row-1,k = j-1;i>=0 && k>=0;i--,k--){
            if(board[i][k]== 'Q') return false;
        }
        for(int i = row-1,k = j+1;i>=0 && k<n;i--,k++){
            if(board[i][k]== 'Q') return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nqueens(board,0,n);
        return res;
    }
}