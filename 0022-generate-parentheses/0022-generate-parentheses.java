class Solution {
    public void dfs(int open,int close,String st,int n,List<String> str){
        if(open==close && open+close==n*2){
        str.add(st);
        return;
        }
        if(open<n)
        dfs(open+1,close,st+"(",n,str);
        if(close<open)
        dfs(open,close+1,st+")",n,str);
    }
    public List<String> generateParenthesis(int n) {
       List<String> str=new ArrayList<>();
       dfs(0,0,"",n,str);
       return str; 
    }
}