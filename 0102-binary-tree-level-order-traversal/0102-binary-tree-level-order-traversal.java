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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        List<Integer> tmp= new ArrayList<>();
        
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(q.size()>0){
            TreeNode curr= q.remove();
            if(curr==null){
                res.add(tmp);
                tmp= new ArrayList<>();
                if(q.size()>0) q.add(null);
            }else{
                tmp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return res;
    }
}