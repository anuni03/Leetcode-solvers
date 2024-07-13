class Solution {
    public double myPow(double x, int n) {
         long absN = (long) n;
        if (n < 0) {
            x = 1 / x;
            absN = -absN;
        }
        double pow = 1;
        while (absN > 0) {
            if ((absN %2) != 0) { //
                pow *= x; 
            } 
            x *= x;
            absN /= 2;
        }
        return pow;

    }
}