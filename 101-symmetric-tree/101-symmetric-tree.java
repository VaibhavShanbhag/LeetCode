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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        if(root.left == null && root.right == null)
            return true;
        
        return mirror(root.left, root.right);
    }
    
    public boolean mirror(TreeNode node1, TreeNode node2){
        if(node1 == null || node2 == null)
            return (node1 == node2);
        
        if(node1.val != node2.val)
            return false;
        
        return (mirror(node1.left, node2.right) && mirror(node2.left,node1.right));
    }
}