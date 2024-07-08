class Solution {
    public int findMin(int[] nums) {
       int l=0;
       int h=nums.length-1;
       int ans=Integer.MAX_VALUE;
      
       if(nums.length==1)
       return nums[0];
      
       while(l<=h){
        int mid=(l+h)/2;
     
        if(nums[l]<=nums[mid]){
           ans=Math.min(ans,nums[l]);
            l=mid+1;
        }else{
           ans=Math.min(ans,nums[mid]);
            h=mid-1;
        }
       } 
       return ans;
    }
}