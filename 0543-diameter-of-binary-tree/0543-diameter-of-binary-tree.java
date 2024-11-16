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
    private int calc(TreeNode root){
        if(root==null) return 0;
        int lt= calc(root.left);
        int rt= calc(root.right);
        dia= Math.max(dia,lt+rt);
        return 1+ Math.max(lt,rt);
    }
    int dia= 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // int dia = 0;
        calc(root);
        return dia;
    }
}