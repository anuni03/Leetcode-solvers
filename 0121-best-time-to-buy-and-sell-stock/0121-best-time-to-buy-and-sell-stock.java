class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int max_pro=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>mini)
            max_pro=Math.max(max_pro,prices[i]-mini);
            if(prices[i]<mini){
                mini=prices[i];
            }
        }
        return max_pro;

    }
}