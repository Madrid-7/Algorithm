package Test2;

import java.util.Scanner;

/**
 * @author ：ZXF
 * @program: 2021_5_5
 * @description:
 * @date ：2021-05-09 10:58
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - m + 1; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (arr[i + j] > h) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);

    }
}
