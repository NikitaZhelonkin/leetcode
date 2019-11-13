public class BalancedBinaryTree {


    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return helper(root) != -1;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;
        int depthLeft = helper(root.left);
        int depthRight = helper(root.right);
        if (Math.abs(depthLeft - depthRight) > 1 || depthLeft == -1 || depthRight == -1) {
            return -1;
        }
        return Math.max(depthLeft, depthRight) + 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        System.out.println(balancedBinaryTree.isBalanced(node));
    }

}
