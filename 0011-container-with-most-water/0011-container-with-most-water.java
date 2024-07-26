class Solution {
    public int maxArea(int[] height) {
      int i=0;
      int j=height.length-1;
      int area=0,maxare=0;
      while(i!=j){
area=Math.min(height[i],height[j])*(j-i);
if(area>maxare)
maxare=area;
if(height[i]<height[j])
i++;
else
j--;
      }  
      return maxare;
    }
}