class Solution {
    public boolean magic(int[][] grid,int i,int j,int n,int m){
boolean seen[]=new boolean[10];
for(int x=0;x<3;x++){
    for(int y=0;y<3;y++){
        int num=grid[i+x][j+y];
        if(num<1 || num>9 || seen[num])return false;
        seen[num]=true;
    }
}
int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2];
for(int x=0;x<3;x++){
    if(sum!=grid[i+x][j]+grid[i+x][j+1]+grid[i+x][j+2])return false;
}
for(int x=0;x<3;x++){
    if(sum!=grid[i][j+x]+grid[i+1][j+x]+grid[i+2][j+x])return false;
}
if(sum!=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2])return false;
if(sum!=grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2])return false;
return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     int c=0;
     for(int i=0;i<=n-3;i++){
        for(int j=0;j<=m-3;j++){
        
               if(magic(grid,i,j,n,m))
               c++;
            
        }
     }
     return c;   
    }
}