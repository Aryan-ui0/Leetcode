class Solution {
    private boolean check(char[][] board,String word,int i,int j,int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
            check(board,word,i+1,j,index+1) || check(board,word,i-1,j,index+1)
            || check(board,word,i,j+1,index+1) || check(board,word,i,j-1,index+1);

        board[i][j] = temp;
        return found;  
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(check(board,word,i,j,0))return true;
            }
        }
        return false;
    }
}