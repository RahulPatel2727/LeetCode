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
    TreeNode parent;
    int ans = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        // parent = root.val;
        minD(root);
        return ans;
    }
    public void minD(TreeNode root){
        if(root == null){
            return;
        }
        minD(root.left);
        if(parent!=null){
            ans = Math.min(ans, Math.abs(root.val - parent.val));
        }
        parent = root;
        minD(root.right);
    }
}