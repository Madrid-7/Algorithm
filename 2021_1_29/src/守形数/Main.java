package 守形数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            int m = n * n;

            String str1 = String.valueOf(n);
            String str2 = String.valueOf(m);
            String str3 = str2.substring(str2.length()-str1.length());
            if (str3.equals(str1)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }

        }
    }
}
