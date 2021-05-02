package offer28;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-02 17:11
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetryTree(root.left, root.right);
    }

    private boolean symmetryTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        return left.val == right.val
                && symmetryTree(left.left, right.right)
                && symmetryTree(left.right, right.left);
    }
}
