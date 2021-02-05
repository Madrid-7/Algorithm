package 球的半径和体积;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double x0=sc.nextFloat();
            double y0=sc.nextFloat();
            double z0=sc.nextFloat();
            double x1=sc.nextFloat();
            double y1=sc.nextFloat();
            double z1=sc.nextFloat();

            double r = Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2)+Math.pow(z0-z1,2));
            double v = 4/3.0*Math.acos(-1)*Math.pow(r,3);

            System.out.printf("%.3f", r);
            System.out.print(" ");
            System.out.printf("%.3f", v);
            System.out.println();
        }
    }
}
