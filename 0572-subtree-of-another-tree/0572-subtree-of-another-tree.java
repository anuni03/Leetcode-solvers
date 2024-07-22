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
    public boolean see(TreeNode root,TreeNode sub){
        if(root!=null&&sub==null)
        return false;
                if(root==null&&sub!=null)
        return false;
        if(root==null && sub==null)
        return true;
 if(root.val!=sub.val)
        return false;
      
        return see(root.left,sub.left)&& see(root.right,sub.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null && root!=null && subRoot==null)
        return true;
        if(root==null && subRoot!=null)
        return false;

        if(see(root,subRoot))return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}