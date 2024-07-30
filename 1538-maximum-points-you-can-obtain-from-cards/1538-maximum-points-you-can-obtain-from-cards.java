class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int leftS=0;
     for(int i=0;i<k;i++) 
     leftS+=cardPoints[i];
    int maxS=leftS;
     int rightS=0;
     int j=cardPoints.length-1;
     for(int i=k-1;i>=0;i--){
leftS-=cardPoints[i];
rightS+=cardPoints[j];
j--;
maxS=Math.max(maxS,leftS+rightS);
     }  
     return maxS;
    }
}