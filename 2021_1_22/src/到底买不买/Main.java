package 到底买不买;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            int lack = 0;



            for (char ch : arr2) {
                boolean change = false;
                for (int i = 0; i < arr1.length; i++) {
                    if(ch == arr1[i]) {
                        arr1[i] = '#';
                        change = true;
                        break;
                    }

                }
                if (change) continue;

                lack++;
            }
            if (lack == 0) {
                System.out.println("Yes " + (str1.length() - str2.length()));
            } else {
                System.out.println("No " + lack);
            }
        }

    }
}
