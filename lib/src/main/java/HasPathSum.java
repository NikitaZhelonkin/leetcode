public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum, 0);
    }

    public boolean helper(TreeNode root, int target, int sum) {
        if (root == null) return false;
        sum += root.val;
        if (sum == target && root.left == null && root.right == null) return true;
        return helper(root.left, target, sum) || helper(root.right, target, sum);
    }


}
