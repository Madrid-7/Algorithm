package offer27;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-02 16:42
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
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        return root;
    }
}
