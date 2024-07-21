/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int mini(TreeNode node,int[] dia){
        if(node ==null)
        return 0;
int lh=mini(node.left,dia);
int rh=mini(node.right,dia);
dia[0]=Math.max(dia[0],lh+rh);
return 1+Math.max(lh,rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        int dia[]=new int[1]; // for passing values and retaining them as arrays are passed by reference 
       mini(root,dia);
       return dia[0];  
    }
}