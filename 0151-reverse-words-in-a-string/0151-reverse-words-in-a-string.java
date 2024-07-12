class Solution {
    public String reverseWords(String s) {
       String st[]=s.split(" ");
      List<String> str=new ArrayList<String>();
       for(String c:st){
        if(!c.isEmpty()){
            str.add(0,c);
        }
       }
       return String.join(" ",str).trim(); 
    }
}