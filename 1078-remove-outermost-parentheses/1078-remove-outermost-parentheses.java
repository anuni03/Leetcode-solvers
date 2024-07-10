class Solution {
    public String removeOuterParentheses(String s) {
        int cou=0;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if((c=='('&& cou++>0) || (c==')'&&cou-->1))
            {
               str.append(c); 
            }
        }
      return  str.toString();
    }
}