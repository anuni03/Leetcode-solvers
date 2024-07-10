class Solution {
    public String largestOddNumber(String num) {
       boolean ch=false;
       if(num.charAt(num.length()-1)%2==1)
       return num;
       for(int i=num.length()-1;i>=0;i--){
        if(num.charAt(i)%2==1)
        return num.substring(0,i+1);
        else
        continue;
       }
       return ""; 
    }
}