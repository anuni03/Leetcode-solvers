class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hms=new HashMap<Character,Character>();
         HashMap<Character,Character> hmt=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
           char sc=s.charAt(i);
           char tc=t.charAt(i);
           if((hms.containsKey(sc) &&hms.get(sc)!=tc)|| (hmt.containsKey(tc)&& hmt.get(tc)!=sc))
           return false;     
           hms.put(sc,tc);
           hmt.put(tc,sc);
           
        }
        return true;
    }
}