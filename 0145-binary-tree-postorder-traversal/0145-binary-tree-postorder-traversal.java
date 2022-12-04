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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack =  new Stack<>();
        stack.push(root);
        
        Stack<Integer> output = new Stack<>();
        while(!stack.isEmpty()){

        TreeNode curr = stack.pop();  
            output.push(curr.val);
            
            if(curr.left != null){
                stack.push(curr.left);
            }
            
            if(curr.right != null){
                stack.push(curr.right);
            }
        }
        while(!output.isEmpty()){
            list.add(output.pop());
        }
        return list;
    }
}