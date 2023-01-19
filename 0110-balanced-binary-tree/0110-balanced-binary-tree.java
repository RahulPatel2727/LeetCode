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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    public static int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if (heightDiff > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}