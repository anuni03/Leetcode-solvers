class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k==cardPoints.length)
        {
            int sum=0;
            for(int i:cardPoints)
            sum+=i;
            return sum;
        }
        int sum=0;
        int maxs=0;
        for(int i=0;i<k;i++)
        sum+=cardPoints[i];
        maxs=Math.max(maxs,sum);
        sum=0;
        for(int i=cardPoints.length-1;i>cardPoints.length-k-1;i--)
        sum+=cardPoints[i];
        maxs=Math.max(maxs,sum);
        int sumx=0;
        int sumy=0;
        for(int i=0;i<k-1;i++){
            sumx+=cardPoints[i];
            int j=cardPoints.length-1;
            while(j>cardPoints.length-k+i)
            {
                 sumy+=cardPoints[j];
                 j--;
            }
            sum=sumx+sumy;
            maxs=Math.max(maxs,sum);
            sumy=0;
        }
return maxs;
    }
}