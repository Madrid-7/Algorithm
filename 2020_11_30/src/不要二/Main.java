package 不要二;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int firstKind = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2);
        int secondKind = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2);
        int ans = m / 4 * (firstKind + secondKind) * 2;
        if(m % 4 > 0) ans += firstKind;
        if(m % 4 > 1) ans += firstKind;
        if(m % 4 > 2) ans += secondKind;
        System.out.println(ans);
    }
}