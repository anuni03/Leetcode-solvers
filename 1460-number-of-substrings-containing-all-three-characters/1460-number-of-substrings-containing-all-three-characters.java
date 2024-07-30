class Solution {
    public int numberOfSubstrings(String s) {
       int atot=0,btot=0,ctot=0,i=0,ans=0;
       for(int j=0;j<s.length();j++){
        char c=s.charAt(j);
        if(c=='a')atot++;
        else if(c=='b')btot++;
        else ctot++;
        while(atot>0 && btot>0 && ctot>0){
            ans+=s.length()-j;
            char ic=s.charAt(i);
            if(ic=='a')atot--;
            else if(ic=='b')btot--;
            else ctot--;
            i++;
        }
       } 
       return ans;
    }
}