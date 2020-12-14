package DNA序列;

import java.util.Scanner;

public class Main {
    public static double GetRatio(String str) {
        double ratio = 0;
        double count = 0;
        for (char ch : str.toCharArray()){
            if(ch == 'G' || ch == 'C')
            count++;
        }
        ratio = count/(double)str.length();
        return ratio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            int n = sc.nextInt();

            String maxStr = "";
            double maxRatio = 0;

            for (int i = 0; i <= str.length() - n; i++) {
                String subStr = str.substring(i, i + n);
                if (GetRatio(subStr) > maxRatio) {
                    maxRatio = GetRatio(subStr);
                    maxStr = subStr;
                }
            }
            System.out.println(maxStr);
        }
    }
}
