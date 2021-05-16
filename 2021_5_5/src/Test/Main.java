package Test;

/**
 * @author ：ZXF
 * @program: 2021_5_5
 * @description:
 * @date ：2021-05-09 11:48
 */

//package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("请输入你创造的利润(单位：万元):");

        Scanner scanner=new Scanner(System.in);
        double profit=0;
        double bonus=0;
        boolean isFlag=true;
        try
        {
            profit=scanner.nextDouble();
            if(profit<0)
            {
                isFlag=false;
            }
        }
        catch (Exception ex)
        {
            isFlag=false;

        }

        if(isFlag==true)
        {
            if (profit<=10) {

                bonus=profit*0.1;

            }else if(profit<=20){

                bonus=(profit-10)*0.075+1;

            }else if (profit<=40 ) {

                bonus=(profit-20)*0.05+1.75;

            }else if (profit<=60 ) {

                bonus=(profit-40)*0.03+2.75;

            }else if (profit<=100 ) {

                bonus=(profit-60)*0.015+3.35;

            }else {

                bonus=(profit-100)*0.01+3.95;

            }
            System.out.println(bonus);
        }
        else
        {
            System.out.println("N/A");
        }

    }
}
