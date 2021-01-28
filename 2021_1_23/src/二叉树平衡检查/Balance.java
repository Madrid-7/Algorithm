package 二叉树平衡检查;

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }

        int deepLeft = nodeDeep(root.left);
        int deepRight = nodeDeep(root.right);
        if (Math.abs(deepLeft-deepRight) > 1)
            return false;
        return isBalance(root.left)&&isBalance(root.right);
    }

    private int nodeDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left==null && root.right==null)
            return 1;

        int deepLeft = 0;
        int deepRight = 0;

        if (root.left != null) {
            deepLeft = nodeDeep(root.left);
        }
        if (root.right != null) {
            deepRight = nodeDeep(root.right);
        }
        return Math.max(deepLeft, deepRight) + 1;
    }
}
