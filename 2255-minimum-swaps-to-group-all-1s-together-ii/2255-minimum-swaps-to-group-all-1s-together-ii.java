class Solution {
    public int minSwaps(int[] nums) {
        int tot=0;
        for(int i:nums)
        tot+=i;
        if(tot==0 || tot==nums.length)
        return 0;
        int curr=0;
        for(int i=0;i<tot;i++)
        curr+=nums[i];
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            curr-=nums[i];
            curr+=nums[(i+tot)%nums.length];
            maxi=Math.max(maxi,curr);
        }
        return tot-maxi;
    }
}