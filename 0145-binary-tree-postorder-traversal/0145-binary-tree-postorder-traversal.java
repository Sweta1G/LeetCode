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
    public List<Integer> postorderTraversal(TreeNode node) {
        Stack<TreeNode> st= new Stack<>();
        st.push(node);
        TreeNode curr= node;
        List<Integer> res= new ArrayList<>();
        if(node==null) return res;
        while(!st.isEmpty()){
            if(curr.left!=null){
                st.push(curr);
                curr= curr.left;
            }
            else if(curr.right!=null){
                st.push(curr);
                curr= curr.right;
            }else{
                res.add(curr.val);
                curr= st.pop();
                if(curr.left!=null)
                    curr.left=null;
                else if(curr.right!=null)
                    curr.right=null;
            }
        
        }
        return res;
    }
}