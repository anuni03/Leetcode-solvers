class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int sub=1<<n;
         List<List<Integer>> ans=new ArrayList<>();
        for(int num=0;num<sub;num++){
        List<Integer> li=new ArrayList<>();
        for(int bit=0;bit<n;bit++){
            if((num & (1<<bit))>0) //imp to put greater than zero not the condition (==1)
            li.add(nums[bit]);
        }
        ans.add(li);
        }
        return ans;
    }
}