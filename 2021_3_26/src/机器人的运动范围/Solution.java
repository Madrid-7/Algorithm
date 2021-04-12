package 机器人的运动范围;

/**
 * @author ：ZXF
 * @program: 2021_3_26
 * @description:
 * @date ：2021-03-26 17:27
 */

public class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(m, n, k, visited, 0, 0);
    }

    private int dfs(int m, int n, int k, boolean[][] visited, int row, int col) {
        if (row < 0 || col <0 || row >= m || col >= n || visited[row][col]) {
            return 0;
        }

        int sum = 0;
        int x = row, y = col;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        while (y != 0) {
            sum += y % 10;
            y /= 10;
        }
        if (sum > k) {
            return 0;
        }

        visited[row][col] = true;
        return 1 + dfs(m, n, k, visited, row+1, col) + dfs(m, n, k, visited, row, col+1);
    }
}
