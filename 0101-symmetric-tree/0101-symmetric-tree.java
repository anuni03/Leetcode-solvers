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
    public boolean see(TreeNode lv,TreeNode rv){
        if(lv==null && rv==null)
        return true;
        if(lv==null && rv!=null ||lv!=null && rv==null)
        return false;
if(lv.val!=rv.val)
return false;
return see(lv.left,rv.right)&&see(lv.right,rv.left);

    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        return see(root.left,root.right);
    }
}