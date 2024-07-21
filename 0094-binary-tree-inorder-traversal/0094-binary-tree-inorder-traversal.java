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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        if(root==null)
        return li;
        class Tra{
            Tra(TreeNode curr){
                if(curr.left!=null)
                new Tra(curr.left);
                li.add(curr.val);
                if(curr.right!=null)
                new Tra(curr.right);
            }
        }
        new Tra(root);
        return li;
    }
}