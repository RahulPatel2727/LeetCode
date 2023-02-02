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
class BST_pair{
    boolean isBST = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isBST;
        
    }
    public BST_pair validBST(TreeNode root){
        if(root == null){
            return new BST_pair();
        }
        BST_pair lbp = validBST(root.left);
        BST_pair rbp = validBST(root.right);
        BST_pair sbp = new BST_pair();
        sbp.max = Math.max(lbp.max,Math.max( rbp.max, root.val ));
        sbp.min = Math.min(lbp.min,Math.min( rbp.min, root.val ));
        if(lbp.isBST && rbp.isBST && lbp.max < root.val && rbp.min > root.val){
            sbp.isBST = true;
        }
        else{
            sbp.isBST = false;
        }
        return sbp;
    }
    
}