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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> mypre=new ArrayList<>();
        if(root==null)
        return mypre;
        class Traverse{
            Traverse(TreeNode currentNode){
                mypre.add(currentNode.val);
                if(currentNode.left!=null)
                 new Traverse(currentNode.left);
                 if(currentNode.right!=null)
                 new Traverse(currentNode.right);
            }
        }
        new Traverse(root);
        return mypre;
    }
}