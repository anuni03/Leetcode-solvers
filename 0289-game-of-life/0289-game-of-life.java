class Solution {
    public void gameOfLife(int[][] board) {
        int dx[]={-1,0,1};
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                  int liva=0;
                for(int ix:dx){
                    for(int jx:dx){
                     if(ix==0 && jx==0)continue;
                        int x=i+ix;
                        int y=j+jx;
                        if(x>=0 && x<board.length && y>=0 && y<board[0].length && (board[x][y]==1 || board[x][y]==2))
                        liva++;
                    }
                }
                if(board[i][j]==1 && (liva<2 || liva>3))
                board[i][j]=2; //1--->0
                if(board[i][j]==0 && (liva==3))
                board[i][j]=-1; // 0--->1
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2)
                board[i][j]=0;
                if(board[i][j]==-1)
                board[i][j]=1;
            }
        }
    }
}