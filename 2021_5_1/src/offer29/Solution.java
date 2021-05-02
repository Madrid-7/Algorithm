package offer29;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-02 17:53
 */

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int startX = 0, startY = 0, endX = matrix[0].length-1, endY = matrix.length-1;
        int[] arr = new int[matrix.length * matrix[0].length];
        int index = 0;

        while (startX <= endX && startY <= endY) {
            for (int i = startX; i <= endX; i++) {
                arr[index++] = matrix[startY][i];
            }
            for (int i = startY+1; i <= endY; i++) {
                arr[index++] = matrix[i][endX];
            }
            for (int i = endX-1; i >= startX && startY < endY; i--) {
                arr[index++] = matrix[endY][i];
            }
            for (int i = endY-1; i >= startY+1 && startX < endX; i--) {
                arr[index++] = matrix[i][startX];
            }
            startX++;
            endX--;
            startY++;
            endY--;
        }
        return arr;
    }
}
