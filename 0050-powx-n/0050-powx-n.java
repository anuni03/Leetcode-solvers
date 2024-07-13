class Solution {
    public double myPow(double x, int n) {
        long abs=(long)n; //imp to be in long 
        if(n<0){
            x=1/x;
            abs=-abs;
        }
        double pow=1;
   while(abs>0){
    if((abs&1)!=0){ // to check odd
        pow*=x;
    }
    x*=x;
    abs>>=1; // to divide by 0
   }
   return pow;
    }
}