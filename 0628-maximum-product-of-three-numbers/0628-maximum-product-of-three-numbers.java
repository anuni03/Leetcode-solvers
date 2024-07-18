class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3)
        return nums[0]*nums[1]*nums[2];
        Arrays.sort(nums);
        int n=nums.length-1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int see=nums[i]*nums[i+1]*nums[i+2];
            if(nums[i]*nums[i+1]*nums[n]>see){
                 see=nums[i]*nums[i+1]*nums[n];
            }
            maxi=Math.max(maxi,see);

        }
        return maxi;
    }
}