package offer26;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-02 15:44
 */

public class Solution2 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean dfs(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null) return false;
        return A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right);
    }
}
