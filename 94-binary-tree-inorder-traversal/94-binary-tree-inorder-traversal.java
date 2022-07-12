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
    List <Integer> tree= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp=root;
        if(temp==null) return tree;
        inorder(temp);
        return tree;
    }
    public void inorder(TreeNode roott){
        if(roott==null) return;
        inorder(roott.left);
        tree.add(roott.val);
        inorder(roott.right);
    }
}