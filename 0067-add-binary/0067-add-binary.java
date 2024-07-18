class Solution {
    public String addBinary(String a, String b) {
    int i=a.length()-1;
    int j=b.length()-1;
    int car=0;
    String str="";
    while(i>=0 || j>=0 ){
        int dig=0;
        if(i>=0)
        dig+=a.charAt(i)-'0';
          if(j>=0)
        dig+=b.charAt(j)-'0';
        dig+=car;
        if(dig==2){
str='0'+str;
car=1;
        }
        else if(dig==3){
            str='1'+str;
car=1;
        }else{
            str=dig+str;
            car=0;
        }
i--;
j--;
    }
    if(i<0&&j<0&&car==1){
        str="1"+str;
    }
return str;
    }
}