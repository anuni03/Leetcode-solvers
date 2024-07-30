class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int odd=0,res=0;
       int ans[]=new int[nums.length+1];
       ans[0]=1;
       for(int i:nums){
        odd+=i%2;
        if(odd-k>=0)res+=ans[odd-k];
        ans[odd]++;
       }
       return res;
    }
}