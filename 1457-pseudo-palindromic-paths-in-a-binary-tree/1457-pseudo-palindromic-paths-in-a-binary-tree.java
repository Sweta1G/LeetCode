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
    int res=0;
    int digits[];
    
    void dfs(TreeNode root){
        if(root==null) return;
        digits[root.val]++;
        if(root.left==null && root.right==null){
            if(isPalindrome()) res++;
        }
        else{
            dfs(root.left);
            dfs(root.right);
        }
        digits[root.val]--;
    }
    boolean isOdd(int n){
        return n%2!=0;
    }
    boolean isPalindrome(){
        
        int odd=0;
        for(int i=1; i<=9; i++){
            if(isOdd(digits[i])) odd++;
        }
        if(odd>1) return false;;
        return true;
        
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        digits= new int[10];
        dfs(root);
        return res;
    }
}