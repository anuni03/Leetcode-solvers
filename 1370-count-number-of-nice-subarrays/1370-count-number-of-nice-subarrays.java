class Solution {
public int atm(int[] nums,int k){
        int ans=0;
      int i=0;
      int c=0;
      for(int j=0;j<nums.length;j++){
if(nums[j]%2==1)
c++;
while(c>k){
    if(nums[i]%2==1)
      c--;
      i++;
}

ans+=j-i+1;
      } 
      return ans;
}



    public int numberOfSubarrays(int[] nums, int k) {
   return atm(nums,k)-atm(nums,k-1);
    }

}