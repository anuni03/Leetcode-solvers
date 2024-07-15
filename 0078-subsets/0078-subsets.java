class Solution {
    public void solve(int index,int[] nums,List<Integer> arr,List<List<Integer>> li){
        li.add(new ArrayList<>(arr));
        for(int i=index;i<nums.length;i++){
            arr.add(nums[i]);
            solve(i+1,nums,arr,li);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> li=new ArrayList<>();
      solve(0,nums,new ArrayList<>(),li);
      return li;
    }
}