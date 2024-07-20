class Solution {
    public String logic(String s){
        StringBuilder str=new StringBuilder();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#')
            c++;
            else if(c!=0)
            c--;
            else
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        s=logic(s);
         t=logic(t);
        return s.equals(t);
    }
}