package 百万富翁问题;

public class Main {
    public static void main(String[] args) {
        System.out.print(30*10 + " ");

        long sum = 0L;
        for (int i = 0; i < 30; i++) {
            sum = (long)Math.pow(2,i) + sum;
        }
        System.out.println(sum);
    }
}
