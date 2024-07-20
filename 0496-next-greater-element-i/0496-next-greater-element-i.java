class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums2.length;i++)
        hm.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++){
            int j=hm.get(nums1[i]);
            if(j==nums2.length-1){
            ans[i]=-1;
            continue;
            }
            boolean see=false;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    ans[i]=nums2[k];
                    see=true;
                    break;
                }
                
            }
            if(see==false)
            ans[i]=-1;

        }
        return ans;
    }
}