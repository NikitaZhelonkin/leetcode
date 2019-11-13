public class MaxDepthBinaryTree {


    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, int depth) {
        if (root == null) return 0;
        depth += Math.max(maxDepth(root.left), maxDepth(root.right));
        return depth + 1;
    }
}
