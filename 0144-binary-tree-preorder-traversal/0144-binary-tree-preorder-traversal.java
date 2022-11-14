class Solution {

    private List<Integer> result;

    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traversePreOrder(root);
        return result;
    }

    private void traversePreOrder(TreeNode node) {
        if (node == null) return;

        result.add(node.val);
        if (node.left != null) {
            traversePreOrder(node.left);
        }
        if (node.right != null) {
            traversePreOrder(node.right);
        }
    }
}
