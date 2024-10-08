class Solution {
    public boolean search(int i,int j,char[][] board, String word,int k){
        if(k==word.length())
        return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(k))
        return false;
        char c=board[i][j];
        board[i][j]='#';
        boolean op1=search(i+1,j,board,word,k+1);
        boolean op2=search(i-1,j,board,word,k+1);
        boolean op3=search(i,j+1,board,word,k+1);
        boolean op4=search(i,j-1,board,word,k+1);
        board[i][j]=c;
        return op1||op2||op3||op4;
    }
    public boolean exist(char[][] board, String word) {

       for(int i=0;i<board.length;i++){
         for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0))
            {
if(search(i,j,board,word,0))
return true;

            }
         }
       }
       return false;
    }
}