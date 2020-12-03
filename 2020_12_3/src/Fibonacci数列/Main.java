package Fibonacci数列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            int x;

            while (n > b) {
                x = a;
                a = b;
                b = a + x;
            }

            System.out.println(b-n < n-a ? b-n : n-a);
        }
    }
}
