class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String i:strs){
            char ch[]=i.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!mp.containsKey(st))
            mp.put(st,new LinkedList<String>());
            mp.get(st).add(i);
        }
        return new LinkedList<>(mp.values());
    }
}