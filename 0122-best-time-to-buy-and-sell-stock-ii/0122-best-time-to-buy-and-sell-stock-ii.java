class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]>prices[j-1])
            sum+=prices[j]-prices[j-1];
        }
        return sum;
    }
}