class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> li =new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
         Set<Integer> hs=new HashSet<>();
         for(int j=i+1;j<nums.length;j++){
            int third=-(nums[i]+nums[j]);
            if(hs.contains(third)){
                List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                temp.sort(null);
                li.add(temp);
            }else{
                hs.add(nums[j]);
            }
         }
        }
        List<List<Integer>> ans=new ArrayList<>(li);
        return ans;
    }
}