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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(root.val<key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else{
            // if 0 and 1 child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            // for 2 child
            else{
                int min = rightMin(root.right);
                root.right = deleteNode(root.right, min);
                root.val = min;
            }
        }
        return root;
    }
    public static int rightMin(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int l = rightMin(root.left);
        return Math.min(l,root.val);
    }
}