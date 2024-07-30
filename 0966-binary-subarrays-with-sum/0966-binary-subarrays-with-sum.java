class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int[] nums,int goal){
        if(goal<0)
    return 0;
        int i=0,j=0,res=0,sum=0;
        for(j=0;j<nums.length;j++){
sum+=nums[j];
while(sum>goal && i<=j){
    sum-=nums[i];
    i++;
}
res+=j-i+1;
        }
        return res;
    }
}