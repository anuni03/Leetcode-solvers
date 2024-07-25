class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int ans[]=new int[nums.length+1];
       for(int i:nums){
        ans[i]++;
       } 
       List<Integer> arr=new ArrayList<Integer>();
       for(int i=1;i<=nums.length;i++){
        if(ans[i]>1)
        arr.add(i);
       }
       return arr;
    }
}