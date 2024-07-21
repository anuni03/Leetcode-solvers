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
    List<Integer> li=new ArrayList<>();
    public void inorder(TreeNode root,List<Integer> li){
        if(root==null)
        return;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root,li);
        return li;
    }
}