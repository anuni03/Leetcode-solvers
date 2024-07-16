class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ele=-1;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                ele=nums[i];
                c++;
            }else if(nums[i]==ele){
                c++;
            }else{
                c--;
            }
        }
        return ele;
    }
}