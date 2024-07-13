class Solution {
    private static  long MOD=1000000007;
    public long fast_pow(long base,long n){
        long res=1;
        base=base%MOD;
        while(n>0){
            if((n%2)==1){
                res=(res*base)%MOD;
              
            }
            n=n/2;
            base=(base*base)%MOD;
            
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long even_pos=(n+1)/2;
        long odd_pos=n-even_pos;
        
        long ans= (fast_pow(5,even_pos) * fast_pow(4,odd_pos))%MOD;
        return (int)ans;
    }
}