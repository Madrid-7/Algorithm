package 末尾0的个数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n/5 + n/25 + n/125 + n/625);

    }
}
