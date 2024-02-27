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
    int maxlen= Integer.MIN_VALUE;
    public int height(TreeNode node){
        if (node == null)
            return 0;
        else {
            
            int lDepth = height(node.left);
            int rDepth = height(node.right);
 
            
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    public void trav(TreeNode root){
        if(root==null) return;
        int d= height(root.left)+height(root.right);
        maxlen= Math.max(d,maxlen);
        trav(root.left);
        trav(root.right);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        // int d= height(root.left)+height(root.right);
        // maxlen= Math.max(d,maxlen);
        trav(root);
        
        return maxlen;
    }
}