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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        range(root,low,high);
        return sum;
    }
    public void range(TreeNode root, int low , int hi){
        if(root==null){
            return;
        }
        
        range(root.left,low,hi);
        if(root.val>=low && root.val<=hi){
            sum+=root.val;
            // System.out.println(sum);
        }
        range(root.right,low,hi);
    }

}