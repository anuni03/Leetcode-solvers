class Solution {
    public String reverseWords(String s) {
      String w[]=s.split(" ");
List<String> li=new ArrayList<String>();
for(String i:w){
    if(!i.isEmpty()){
        li.add(0,i);
    }
}
return String.join(" ",li).trim();
    }
}