
public class ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l > r) return null;
        if (l == r) return new TreeNode(nums[l]);
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = helper(nums, l, m-1);
        node.right = helper(nums, m + 1, r);
        return node;
    }

}
