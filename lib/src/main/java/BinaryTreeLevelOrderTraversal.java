import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        levelOrderBottom(root, result, 0);
        return result;

    }

    public void levelOrderBottom(TreeNode node, List<List<Integer>> result, int level) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(0, new LinkedList<Integer>());
        }
        levelOrderBottom(node.left, result, level + 1);
        levelOrderBottom(node.right, result, level + 1);
        result.get(result.size()-level-1).add(node.val);
    }
}
