import java.util.Scanner;

/**
 * @author ：ZXF
 * @program: 2021_5_5
 * @description:
 * @date ：2021-05-09 10:18
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[k][5];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int distance = 0;
        int startX = 1, startY = 1;

        distance = minDis(arr, startX, startY, n, m, distance);

        System.out.println(distance);
    }

    private static int minDis(int[][] arr, int startX, int startY, int n, int m, int distance) {
        if (startX == n && startY == m) {
            return distance;
        }
        int[] disArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == startX && arr[i][1] == startY) {
                disArr[i] = minDis(arr, arr[i][2], arr[i][3], n, m, distance+arr[i][4]);
            } else {
                disArr[i] = -1;
            }
        }
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            if (disArr[i] >= 0) {
                if (min == -1) {
                    min = disArr[i];
                } else if (disArr[i] < min) {
                    min = disArr[i];
                }
            }
        }
        return min;
    }
}
