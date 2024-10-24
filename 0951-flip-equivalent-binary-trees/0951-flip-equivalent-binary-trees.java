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
    public boolean flipEquiv(TreeNode n1, TreeNode n2) {
        if(n1==null && n2== null) return true;
        if(n1==null || n2==null || n1.val!=n2.val) return false;
        
        return (flipEquiv(n1.left,n2.left) || flipEquiv(n1.left,n2.right)) && (flipEquiv(n1.right,n2.right)||flipEquiv(n1.right,n2.left));
    }
}