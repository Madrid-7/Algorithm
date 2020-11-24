package 字符串中找出连续最长的数字串;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();

            int count = 0;
            boolean flag = false;
            int start = 0;
            int stop = 0;
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    if (!flag) {
                        start = i;
                        flag = true;
                    }

                } else {
                    if (flag) {
                        flag = false;
                        stop = i;
                        if (stop - start > count) {
                            count = stop - start;
                            result = new String(str.toCharArray(), start, count);
                        }
                    }
                }
            }
            if (flag) {
                flag = false;
                stop = str.length();
                if (stop - start > count) {
                    count = stop - start;
                    result = new String(str.toCharArray(), start, count);
                }
            }

            System.out.println(result);
        }
    }
}
