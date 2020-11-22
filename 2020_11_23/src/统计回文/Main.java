package 统计回文;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int count = 0;
            String a = sc.nextLine();
            String b = sc.nextLine();

            for (int i = 0; i <= a.length(); i++) {
                StringBuilder sb = new StringBuilder(a);
                sb.insert(i, b);
                if(sb.toString().equals(sb.reverse().toString())) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
