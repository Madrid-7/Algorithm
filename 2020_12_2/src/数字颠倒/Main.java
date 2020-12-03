package 数字颠倒;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            char[] arr = sc.nextLine().toCharArray();

            StringBuffer sb = new StringBuffer(new String(arr));
            System.out.println(sb.reverse().toString());

            for (int i = 0; i < arr.length/2; i++) {
                char tmp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = tmp;
            }

            System.out.println(arr);
        }
    }
}
