class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int i=0;
        int j=0;
        int num_zero=0;
    while(j<nums.length){
        if(nums[j]==0)
        num_zero++;
        while(num_zero>k){
         if(nums[i]==0)
         num_zero--;
         i++; 
        }

        ans=Math.max(ans,j-i+1);
        j++;
    }
    return ans;
    }
}