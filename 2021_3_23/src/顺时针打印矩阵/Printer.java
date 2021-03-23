package 顺时针打印矩阵;

/**
 * @author ：ZXF
 * @program: 2021_3_23
 * @description:
 * @date ：2021-03-23 15:53
 */

public class Printer {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int [] arr = new int[n*m];
        int startX = 0;
        int endX = m - 1;
        int startY = 0;
        int endY = n - 1;
        int index = 0;

        while (startX <= endX && startY <= endY) {

            for (int i = startX; i <= endX; i++) {
                arr[index++] = mat[startY][i];
            }

            for (int i = startY + 1; i <= endY; i++) {
                arr[index++] = mat[i][endX];
            }

            if (endY > startY) {
                for (int i = endX - 1; i >= startX; i--) {
                    arr[index++] = mat[endY][i];
                }
            }

            if (endX > startX) {
                for (int i = endY - 1; i >= startY + 1; i--) {
                    arr[index++] = mat[i][startX];
                }
            }

            startX++;
            endX--;
            startY++;
            endY--;
        }
        return arr;
    }
}
