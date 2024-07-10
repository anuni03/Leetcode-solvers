class Solution {
    public String removeOuterParentheses(String s) {
        int open=0;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if((c=='('&&open++>0) || (c==')'&&open-->1))
            str.append(c);
        }
        return str.toString();
    }
}