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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        Depth(root);
        return max;
    }
    
    private int Depth(TreeNode root){
        if(root == null) return 0;
        
        int ldia = Depth(root.left);
        int rdia = Depth(root.right);
        
        max = Math.max(max, ldia + rdia);
        
        return Math.max(ldia, rdia)+1;
    }
}