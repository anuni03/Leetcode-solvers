class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0;
       int max=Integer.MIN_VALUE;
       int sum=0;
       for(int j=0;j<nums.length;j++){
    sum+=nums[j];
    if(j>=k-1){
        max=Math.max(max,sum);
        sum-=nums[i];
        i++;
    }
       }
       return (double)max/k;
    }
}