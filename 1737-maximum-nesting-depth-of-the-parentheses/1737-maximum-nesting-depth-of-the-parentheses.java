class Solution {
    public int maxDepth(String s) {
        int op=0;
        int maxi=0;
        for(char c:s.toCharArray()){
            if(c=='(')
            op++;
            if(c==')')
            op--;
            maxi=Math.max(maxi,op);
        }
        return maxi;
    }
}