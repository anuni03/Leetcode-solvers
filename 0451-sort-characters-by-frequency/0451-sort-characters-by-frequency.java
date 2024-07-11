class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer> hm=new HashMap<>();
      for(char c : s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
      }
      PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        StringBuilder str=new StringBuilder();
        while(!pq.isEmpty()){
            char curr=pq.poll();
            int freq=hm.get(curr);
            for(int i=0;i<freq;i++)
            str.append(curr);
        }
        return str.toString();
    }
}