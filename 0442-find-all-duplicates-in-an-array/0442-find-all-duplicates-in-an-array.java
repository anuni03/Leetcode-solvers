class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    
       List<Integer> arr=new ArrayList<Integer>();
       for(int i=0;i<nums.length;i++){
       int x=Math.abs(nums[i]);
       if(nums[x-1]<0)
       arr.add(x);
       nums[x-1]*=-1;
       }

       return arr;
    }
}