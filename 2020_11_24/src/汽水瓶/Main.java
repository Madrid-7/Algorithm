package 汽水瓶;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int emptySum = sc.nextInt();
            if (emptySum == 0) return;
            System.out.println(emptySum/2);
        }
    }
}
