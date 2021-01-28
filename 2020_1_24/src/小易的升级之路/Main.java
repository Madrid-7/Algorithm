package 小易的升级之路;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int bi = sc.nextInt();
                if (a >= bi) {
                    a += bi;
                } else {
                    for (int j = a; j > 0; j--) {
                        if (bi % j == 0 && a % j ==0) {
                            a += j;
                            break;
                        }
                    }
                }
            }
            System.out.println(a);
        }
    }
}
