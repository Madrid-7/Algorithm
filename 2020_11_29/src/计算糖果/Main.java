package 计算糖果;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int y3 = sc.nextInt();
            int y4 = sc.nextInt();

            float a = (y1+y3)/2f;
            float b = (y3-y1)/2f;
            float c = (y4-y2)/2f;

            if((a-((y1+y3)/2))!= 0){
                System.out.print("No");
                return;
            }
            if((b-((y3-y1)/2))!=0||(b!=((y2+y4)/2))){
                System.out.print("No");
                return;
            }
            if((c-((y4-y2)/2))!=0){
                System.out.print("No");
                return;
            }
            System.out.print((int)a+" "+(int)b+" "+(int)c);
        }
    }
}
