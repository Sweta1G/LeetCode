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
    private void dfs(TreeNode root, List<String> paths, List<Integer> curPath) {
        curPath.add(root.val);
        if (root.left == null && root.right == null) 
            paths.add(pathToString(curPath));
        
        if (root.left != null) {
            dfs(root.left, paths, curPath);
        }
        if (root.right != null) {
            dfs(root.right, paths, curPath);
        }
        // Reset curPath
        curPath.remove(curPath.size() - 1);
    }
    private String pathToString(List<Integer> curPath){
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(i<curPath.size()){
            if(i==curPath.size()-1) sb.append(String.valueOf(curPath.get(i++)));
            else{
                sb.append(String.valueOf(curPath.get(i++)));
                sb.append("->");
            }
        }
        return sb.toString();
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path= new ArrayList<>();
        if(root.right==null && root.left==null){
            path.add(String.valueOf(root.val));
            return path;
        }
        List<Integer> curPath= new ArrayList<>();
        dfs(root,path,curPath);
        return path;
    }
}