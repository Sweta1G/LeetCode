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
    private boolean find(TreeNode root, long mn, long mx){
        if(root==null) return true;
        if(!(root.val>mn && root.val<mx)) return false;
        return find(root.left,mn,root.val) && find(root.right,root.val,mx);
    }
    public boolean isValidBST(TreeNode root) {
        long max= Long.MAX_VALUE;
        long min= Long.MIN_VALUE;
        return find(root,min,max);
    }
}