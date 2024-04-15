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
    private int helper(TreeNode root, int res){
        if(root==null) return 0;
        
        res= root.val+ res*10;
        if(root.left==null && root.right==null) return res;
        
        return helper(root.left,res) + helper(root.right,res);
    }
    public int sumNumbers(TreeNode root){
        return helper(root,0);
    }
    
}