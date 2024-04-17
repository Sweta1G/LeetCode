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
    private char convert(int n){
        switch(n){
            case 0: return 'a';case 1: return 'b';case 2: return 'c';case 3: return 'd';case 4: return 'e';
            case 5: return 'f';case 6: return 'g';case 7: return 'h';case 8: return 'i';
            case 9: return 'j';case 10: return 'k';case 11: return 'l';case 12: return 'm';case 13: return 'n';case 14: return 'o';
            case 15: return 'p';case 16: return 'q';case 17: return 'r';case 18: return 's';case 19: return 't';case 20: return 'u';
            case 21: return 'v';case 22: return 'w';case 23: return 'x';case 24: return 'y';
        }
        return 'z';
    }
    private void dfs(TreeNode root, StringBuilder sb, StringBuilder path){
        if(root==null) return;
        path.append(convert(root.val));
        
        if(root.right==null && root.left==null){
            String rev= path.reverse().toString();
            if(sb.length() == 0 || rev.compareTo(sb.toString()) < 0) {
                sb.setLength(0);
                sb.append(rev);
            }
            path.reverse(); // backtrack by reversing again
        }
        
        dfs(root.left, sb, path);
        dfs(root.right, sb, path);
        
        path.setLength(path.length() - 1);
    }
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        if(root.right==null && root.left==null) {sb.append(convert(root.val)); return sb.toString();}
        
        dfs(root,sb, new StringBuilder());
        return sb.toString();
    }
}