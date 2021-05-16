package Test3;

import java.util.Scanner;

/**
 * @author ：ZXF
 * @program: 2021_5_5
 * @description:
 * @date ：2021-05-09 11:11
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] arr = new int[t][4];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(fun(arr[i]));
        }
    }

    private static int fun(int[] ints) {
        int arr[] = new int[ints[3]];
        for (int i = 0; i < ints[3]; i++) {
            int x = ints[0];
            int a = ints[1];
            int b = ints[2];
            int n = ints[3];

            x = x + b*i;
            n = n - i;
            while (x > 0 && n > 0) {
                arr[i] += x;
                x -= a;
                n--;
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
