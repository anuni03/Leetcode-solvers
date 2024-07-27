class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int row1=0,col1=0,c=0;
      int m=matrix.length,n=matrix[0].length;
      int row2=m-1,col2= n-1;
     List<Integer> ans=new ArrayList<>();
     while(c<m*n){
      for(int i=col1;i<=col2&& c<m*n;i++){
      ans.add(matrix[row1][i]);
c++;
      }
      row1++;
     for(int i=row1;i<=row2&& c<m*n;i++){
       ans.add(matrix[i][col2]);
c++;
     }
      col2--;
        for(int i=col2;i>=col1&& c<m*n;i--){
      ans.add(matrix[row2][i]);
      c++;
        }
      row2--;
        for(int i=row2;i>=row1&& c<m*n;i--){
      ans.add(matrix[i][col1]);
      c++;
        }
      col1++;
     }
      return ans;
    }
}