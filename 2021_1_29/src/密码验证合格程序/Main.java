package 密码验证合格程序;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();

            // 1.长度超过8位
            if (str == null || str.length() < 9) {
                System.out.println("NG");
                continue;
            }

            // 2.包括大小写字母.数字.其它符号,以上四种至少三种
            int f1 = 0, f2 = 0, f3 = 0, f4 = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    f1 = 1;
                } else if (ch >= 'a' && ch <= 'z') {
                    f2 = 1;
                } else if (ch >= 'A' && ch <= 'Z') {
                    f3 = 1;
                } else {
                    f4 = 1;
                }
            }
            if (f1 + f2 + f3 + f4 < 3) {
                System.out.println("NG");
                continue;
            }

            // 3.不能有相同长度超2的子串重复
            int f5 = 0;
            for (int i = 0; i < str.length()-2; i++) {
                String subStr = str.substring(i, i+3);
                if (str.substring(i+1).contains(subStr)) {
                    f5 = 1;
                    break;
                }
            }
            if (f5 == 0) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
}
