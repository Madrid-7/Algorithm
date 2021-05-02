package offer26;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-01 22:07
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
    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (B == null) {
            return false;
        }

        return getANode(A, B);
    }

    private boolean getANode(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }

        if (A.val == B.val) {
            if (inorder(B, A)) {
                return true;
            }
        }

        return getANode(A.left, B) || getANode(A.right, B);
    }

    private boolean inorder(TreeNode rootB, TreeNode rootA) {
        if (rootB == null) {
            return true;
        }

        if (rootA == null || rootB.val != rootA.val) {
            return false;
        }

        return inorder(rootB.left, rootA.left) && inorder(rootB.right, rootA.right);
    }
}
