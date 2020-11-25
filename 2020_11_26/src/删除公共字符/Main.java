package 删除公共字符;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] arr = str2.toCharArray();
            Set<Character> set = new TreeSet<>();
            for (char ch: arr) {
                set.add(ch);
            }
            for (int i = 0; i < str1.length(); i++) {
                if (!set.contains(str1.charAt(i))) {
                    System.out.print(str1.charAt(i));
                }
            }
        }
    }
}
