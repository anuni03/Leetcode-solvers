class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length==0 || strs==null)
    return "";
      Arrays.sort(strs);
      String f=strs[0];
      String l=strs[strs.length-1];
      int mini=Math.min(f.length(),l.length());
       int i=0;
       for(i=0;i<mini;i++){
        if(f.charAt(i)!=l.charAt(i))
        break;
       }
       return f.substring(0,i); 
    }
}