public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode nodeLeft, TreeNode nodeRight){
        if (nodeLeft == null && nodeRight == null) return true;
        if (nodeLeft == null || nodeRight == null) return false;
        return nodeLeft.val==nodeRight.val
                && isSymmetric(nodeLeft.right, nodeRight.left)
                && isSymmetric(nodeLeft.left, nodeRight.right);
    }
}
