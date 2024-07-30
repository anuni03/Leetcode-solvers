class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
for(char c='A';c<='Z';c++){
    int i=0,rep=0,j=0;
    while(j<s.length()){
        if(s.charAt(j)==c){
            j++;
        }else if(rep<k){
            j++;
            rep++;
        }else if(s.charAt(i)==c){
            i++;
        }else{
            i++;
            rep--;
        }
        ans=Math.max(ans,j-i);
    }
   
}
 return ans;
    }
}