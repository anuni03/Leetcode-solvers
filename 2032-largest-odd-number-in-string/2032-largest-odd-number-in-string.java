class Solution {
    public String largestOddNumber(String num) {
       int odd=-1;
    
       for(int i=num.length()-1;i>=0;i--){
        if((num.charAt(i)-'0')%2==1){
      odd=i;
      break;
       }
       }
       return num.substring(0,odd+1); 
    }
}