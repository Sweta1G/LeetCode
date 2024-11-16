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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty()){
            List<Integer> tmp= new ArrayList<>();
            int sx= q.size();
            for(int i=0; i<sx; i++){
                TreeNode curr= q.poll();
                tmp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                curr= q.peek();
            }
            if(c%2!=0) Collections.reverse(tmp);
            res.add(tmp);
            c++;
        }
        return res;
    }
}