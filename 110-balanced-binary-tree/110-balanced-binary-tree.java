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
    public boolean isBalanced(TreeNode root) {
        
        if( root == null) return true;
        
        
         if(Math.abs(height(root.left) - height(root.right)) <= 1){
             return isBalanced(root.left) && (isBalanced(root.right));
         }
        return false;
    }
    
    private int height(TreeNode root){
        if(root == null) return 0;
        
        int lheight  = height(root.left); // calculating height of left subtree
        int rheight = height(root.right); // calculating height of right subtree
        
        return Math.max(lheight, rheight) +1;
        
        
    }
}