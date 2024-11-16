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
    int path= Integer.MIN_VALUE;
    private int calc(TreeNode root){
        if(root==null) return 0;
        int l = Math.max(0,calc(root.left));
        int r = Math.max(0,calc(root.right));
        path= Math.max(root.val+l+r, path);
        return Math.max(l,r)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        calc(root);
        return path;
    }
}