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
    StringBuilder sb= new StringBuilder();
    
    //root- left- right
    public void pretrav(TreeNode root){
        if(root==null) return;
        sb.append('(');
        sb.append(String.valueOf(root.val));
        
        if(root.left == null && root.right != null){ sb.append("()"); }
        
        pretrav(root.left);
        pretrav(root.right);
        sb.append(')');
    } 
    public String tree2str(TreeNode root) {
        
        if(root.left==null && root.right==null){
            sb.append(String.valueOf(root.val));
            return sb.toString();
        }
        pretrav(root);
        return sb.substring(1, sb.length()-1).toString();
        
    }
}