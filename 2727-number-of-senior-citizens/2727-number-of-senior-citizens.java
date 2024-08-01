class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String st:details){
            String age=st.substring(11,13);
if(Integer.parseInt(age)>60)
c++;
        }
        return c;
    }
}