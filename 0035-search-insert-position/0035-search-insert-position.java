class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int ans=-1;
    
        while(l<=h){
            int mid=(l+h)/2;
         if(nums[mid]>=target){
            h=mid-1;
            ans=mid;
         }else{
            l=mid+1;
         }
        }
            if(target<nums[0])ans=0;
        if(target>nums[nums.length-1])ans=nums.length;
        return ans;
    }
}