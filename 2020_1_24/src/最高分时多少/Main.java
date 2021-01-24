package 最高分时多少;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] gradeArr = new int[N];

            for (int i = 0; i < N; i++) {
                gradeArr[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                char c = sc.next().charAt(0);
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (c == 'Q') {
                    int end = Math.max(A, B);
                    int begin = Math.min(A, B)-1;
                    int max = gradeArr[A-1];
                    for (int j = begin; j < end; j++) {
                        if (gradeArr[j] > max)
                            max = gradeArr[j];
                    }
                    System.out.println(max);
                } else {
                    gradeArr[A-1] = B;
                }
            }
        }
    }
}
