package 求最小公倍数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = 1; i <= b; i++) {
                if (a * i % b == 0) {
                    System.out.println(a * i);
                    break;
                }
            }
        }
    }
}
