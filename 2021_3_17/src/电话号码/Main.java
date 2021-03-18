package 电话号码;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ：ZXF
 * @program: 2021_3_17
 * @description: Test
 * @date ：2021-03-17 23:33
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                char[] chars = str.toCharArray();
                StringBuilder end = new StringBuilder();
                for (char aChar : chars) {
                    if (aChar >= '0' && aChar <= '9') {
                        end.append(aChar);
                    } else if (aChar == '-') {
                        continue;
                    } else if (aChar >= 'A' && aChar <= 'C') {
                        end.append('2');
                    } else if (aChar >= 'D' && aChar <= 'F') {
                        end.append('3');
                    } else if (aChar >= 'G' && aChar <= 'I') {
                        end.append('4');
                    } else if (aChar >= 'J' && aChar <= 'L') {
                        end.append('5');
                    } else if (aChar >= 'M' && aChar <= 'O') {
                        end.append('6');
                    } else if (aChar >= 'P' && aChar <= 'S') {
                        end.append('7');
                    } else if (aChar >= 'T' && aChar <= 'V') {
                        end.append('8');
                    } else if (aChar >= 'W' && aChar <= 'Z') {
                        end.append('9');
                    }
                }
                end.insert(3, "-");
                String s = end.toString();
                if (!list.contains(s)) {
                    list.add(s);
                }
            }
            Collections.sort(list);
            for (String s:list) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
