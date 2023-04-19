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
    int maxZigZag = 0;
    
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        longestZigZagHelper(root.left, true, 1);
        longestZigZagHelper(root.right, false, 1);
        return maxZigZag;
    }
    
    private void longestZigZagHelper(TreeNode node, boolean isLeft, int length) {
        if (node == null) return;
        maxZigZag = Math.max(maxZigZag, length);
        if (isLeft) {
            longestZigZagHelper(node.right, false, length + 1);
            longestZigZagHelper(node.left, true, 1);
        } else {
            longestZigZagHelper(node.left, true, length + 1);
            longestZigZagHelper(node.right, false, 1);
        }
    }
}