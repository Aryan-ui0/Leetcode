class Solution {
    private boolean rowcheck(char[][] board,int i,int num){
        for(int j =0;j<9;j++){
            if(board[i][j] != '.' && board[i][j] -'0'==num) return false;
        }
        return true;
    }
    private boolean colcheck(char[][] board,int j,int num){
        for(int i =0;i<9;i++){
            if(board[i][j] != '.' && board[i][j] -'0'==num) return false;
        }
        return true;
    }
    private boolean smallcolcheck(char[][] board,int i,int j,int num){
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] != '.' && board[r][c] - '0' == num) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean backtrack(char[][] board){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]== '.'){

                    for(int num = 1;num<=9;num++){
                        if (rowcheck(board, i, num) &&
                        colcheck(board, j, num) &&
                        smallcolcheck(board, i, j, num)) {
                            board[i][j]= (char)(num + '0');

                            if(backtrack(board)) return true;
                        }

                        board[i][j]= '.';    
                    }
                    return false;
                }
            }

        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
}