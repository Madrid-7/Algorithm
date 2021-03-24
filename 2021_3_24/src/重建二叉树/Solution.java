package 重建二叉树;

import java.util.Arrays;

/**
 * @author ：ZXF
 * @program: 2021_3_24
 * @description:
 * @date ：2021-03-24 17:00
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0)
            return null;

        int rootVal = preorder[0];
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIndex+1), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIndex+1, preorder.length), Arrays.copyOfRange(inorder, rootIndex+1, inorder.length));

        return root;
    }
}
