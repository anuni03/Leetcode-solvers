class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        
  int i=0;
  int j=0;
  for(j=0;j<k;j++){
    sum+=nums[j];
  }
 
double  maxi=(double)sum/k;
  while(j<nums.length){
    sum-=nums[i];
    i++;
sum+=nums[j];
    maxi=Math.max(maxi,(double)sum/k);
    j++;

  }
  return maxi;
    }
}