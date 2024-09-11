class Solution {
    public int totalFruit(int[] fruits) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     int ans=Integer.MIN_VALUE;
     int i=0;
     for(int j=0;j<fruits.length;j++){
           
           hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
           if(hm.size()>2){
            int num=fruits[i];
            hm.put(num,hm.get(num)-1);
            i++;
            if(hm.get(num)==0)
            hm.remove(num);
           }
           ans=Math.max(ans,j-i+1);
     }
     return ans;   
    }
}