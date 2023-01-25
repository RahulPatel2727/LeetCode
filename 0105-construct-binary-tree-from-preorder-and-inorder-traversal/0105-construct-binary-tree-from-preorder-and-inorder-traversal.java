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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
    }
    public static TreeNode create(int [] inorder, int ilo, int ihi, int [] preorder, int plo, int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        
        TreeNode nn=new TreeNode(preorder[plo]);
        int idx = search(inorder, ilo, ihi, preorder[plo]);
        int net = idx - ilo;
        
        nn.left = create(inorder, ilo,idx-1, preorder,plo+1,plo+net);
        nn.right = create(inorder, idx+1, ihi, preorder, plo+net+1,phi);
        return nn;
    }
    public static int search(int [] in, int si, int ei, int item){
        for(int i=si;i<=ei;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
}