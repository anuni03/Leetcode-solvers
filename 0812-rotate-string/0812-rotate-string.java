class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length();
     for(int i=0;i<len;i++){
         s=s+s.charAt(i);
        if((s.substring(i+1)).equals(goal))
        return true;
     }  
     return false; 
    }
}