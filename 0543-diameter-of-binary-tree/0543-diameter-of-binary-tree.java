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
class Solution 
{
    int max;
    public int getDiameter(TreeNode root)
    {
        int h= 0;
        
        if(root == null)//base case 
           return 0;
        
        int l= getDiameter(root.left);//recursing down and calculating the Height 
        int r= getDiameter(root.right);
        
        h= Math.max(l,r);//maximum height 
        
        max= Math.max(max,l+r+1);//updating the maximum diameter 
        
        h=h+1;//increasing heigh covering every node 
        return h; //returning the maximum height 
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        max= Integer.MIN_VALUE;//identity 
        getDiameter(root);
        return max-1; //node=edge+1, i.e; edge=node-1
    }
}//Please do Upvote, It helps a lot