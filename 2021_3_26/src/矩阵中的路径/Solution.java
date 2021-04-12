package 矩阵中的路径;

/**
 * @author ：ZXF
 * @program: 2021_3_26
 * @description:
 * @date ：2021-03-26 14:29
 */

public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        char[] chars = word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chars, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] chars, boolean[][] visited, int i, int j, int index) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if (board[i][j] != chars[index] || visited[i][j]) {
            return false;
        }
        if (index == chars.length - 1) {
            return true;
        }
        visited[i][j] = true;
        boolean ans = dfs(board, chars, visited, i+1, j, index+1)
                || dfs(board, chars, visited, i-1, j, index+1)
                || dfs(board, chars, visited, i, j+1, index+1)
                || dfs(board, chars, visited, i, j-1, index+1);
        visited[i][j] = false;
        return ans;
    }
}
