class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,dup=0,right=0;
        int count[]=new int[128];
        if(s==" ")
            return 0;
        if(s=="")
            return 1;
      for(right=0;right<s.length();right++){
            dup+=((++count[s.charAt(right)])==2?1:0);
                if(dup>0)
           dup-=((--count[s.charAt(left++)]==1)?1:0);
        }
        return right-left;
            
        
        
    }
}