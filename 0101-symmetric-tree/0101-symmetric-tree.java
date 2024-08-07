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
    private boolean mirror(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null || l.val!=r.val) return false;
        
        return mirror(l.left,r.right) && mirror(l.right,r.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root.right==null && root.left==null) return true;
        // if(root==null) return true;
        return mirror(root.left,root.right);
    }
}