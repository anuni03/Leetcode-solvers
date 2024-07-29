class Solution {
    public String reverseWords(String s) {
        
        String arr[]=s.split(" ");
       List<String> str=new ArrayList<>();
       for(String i:arr){
        if(!i.isEmpty()){
           str.add(0,i); 
        }
       }
      return  String.join(" ",str).trim();

    }
}