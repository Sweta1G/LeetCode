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
    public int findBottomLeftValue(TreeNode root) {
        return helper(root, 0).getKey().val;
    }

    private Pair<TreeNode, Integer> helper(TreeNode root, int height) {
        if(root != null) {
            Pair<TreeNode, Integer> left = helper(root.left, height + 1);
            Pair<TreeNode, Integer> right = helper(root.right, height + 1);

            if(left.getKey() == null && right.getKey() == null)
                return new Pair<>(root, height);
            
            if(right.getValue() > left.getValue())
                return right;

            return left;
        }

        return new Pair<>(null, Integer.MIN_VALUE);
    }
}