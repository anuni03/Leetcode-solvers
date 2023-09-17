//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
  public  void f(int ind,ArrayList<Integer> arr,int N,ArrayList<Integer> ans,int sum){
        
        if(ind==N){
        ans.add(sum);
        return;
        }
        
       f(ind+1,arr,N,ans,sum+arr.get(ind));
       f(ind+1,arr,N,ans,sum);
        
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<>();
        if(N==0)return new ArrayList<>();
        if(N==1){
            ans.add(arr.get(0));
            ans.add(0);
            return ans;
        }
        
        
        
        f(0,arr,N,ans,0);
        return ans;
    }
}