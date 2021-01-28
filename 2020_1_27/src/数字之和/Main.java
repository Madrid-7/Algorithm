package 数字之和;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = n * n;

            int sum_n = 0;
            while (n != 0) {
                sum_n += n % 10;
                n /= 10;
            }

            int sum_m = 0;
            while (m != 0) {
                sum_m += m % 10;
                m /= 10;
            }
            System.out.println(sum_n + " " +sum_m);
        }
    }
}
