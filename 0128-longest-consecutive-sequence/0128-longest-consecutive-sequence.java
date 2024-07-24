class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       if(nums.length==0)
       return 0;
       for(int i:nums)
       hs.add(i);
       int ans=1;
       int val=1;
       for(int i:nums){
        if(!hs.contains(i-1)){
            int x=i;
            ans=1;
        while(hs.contains(x+1)){
          x++;
          ans++;
        }
        }
        val=Math.max(val,ans);
        
       }
       return val; 
    }
}