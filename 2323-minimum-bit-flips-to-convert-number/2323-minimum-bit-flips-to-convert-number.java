class Solution {
    public int count(int num){
        int c=0;
        while(num>1){
            c+=num&1;
            num=num>>1;
        }
        if(num==1)
        c++;
        return c;
    }
    public int minBitFlips(int start, int goal) {
      int see=start^goal;
      int ans=count(see);
      return ans;  
    }
}