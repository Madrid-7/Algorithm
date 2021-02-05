package 说反话;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();
            
            String[] arrStr = str.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrStr.length; i++) {
                sb.append(arrStr[arrStr.length-1-i]);
                if (i != arrStr.length-1)
                    sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
