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
class Pair{
    TreeNode root;
    int index;
        
    Pair(TreeNode root,int index){
        this.root=root;
        this.index=index;
    }
}
    
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        
        int ans=0;
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        
        
        while(q.size()>0){
            int size=q.size();
            int l=q.peek().index;
            int r=q.peek().index;
            
            while(size-->0){
                Pair temp=q.poll();
                r=temp.index;
                
                if(temp.root.left!=null) q.add(new Pair(temp.root.left,temp.index*2+1));
                if(temp.root.right!=null) q.add(new Pair(temp.root.right,temp.index*2+2));
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}