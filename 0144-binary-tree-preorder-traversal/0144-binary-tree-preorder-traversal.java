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
     public void postorder(TreeNode node,List<Integer> li){
        if(node ==null)
        return;
        li.add(node.val);
        postorder(node.left,li);
        postorder(node.right,li);
     }
    public List<Integer> preorderTraversal(TreeNode root) {
       
        postorder(root,li);
 return li;
    }
}