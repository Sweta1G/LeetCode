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
class BSTIterator {
    ArrayList<Integer> list;
    int i;
    public BSTIterator(TreeNode root) {
        list= new ArrayList<>();
        trav(root);
        i=0;
    }
    public void trav(TreeNode root){
        if(root==null) return;
        trav(root.left);
        list.add(root.val);
        trav(root.right);
    }

    public int next() {
        if(i<list.size()) return list.get(i++);
        return -1;
    }
    
    public boolean hasNext() {
        return i<list.size()? true:false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */