class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs=new HashSet<Character>();
       int i=0;
       int j=0;
       int ans=0;
      for(j=0;j<s.length();j++){
        if(!hs.contains(s.charAt(j))){
            hs.add(s.charAt(j));
            ans=Math.max(ans,j-i+1);
        }else{
            while(s.charAt(i)!=s.charAt(j)){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.remove(s.charAt(i));
            i++;
            hs.add(s.charAt(j));
        }
      }
      return ans;
    }
}