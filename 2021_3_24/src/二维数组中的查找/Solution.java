package 二维数组中的查找;

/**
 * @author ：ZXF
 * @program: 2021_3_24
 * @description:
 * @date ：2021-03-24 15:06
 */

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int x = matrix[0].length - 1;
        int y = 0;
        while (x >= 0 && y < matrix.length) {
            if (matrix[y][x] == target) {
                return true;
            } else if (matrix[y][x] < target) {
                y++;
            } else if (matrix[y][x] > target) {
                x--;
            }
        }
        return false;
    }
}
