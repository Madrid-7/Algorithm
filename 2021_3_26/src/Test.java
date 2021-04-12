/**
 * @author ：ZXF
 * @program: 2021_3_26
 * @description:
 * @date ：2021-03-26 16:32
 */

public class Test {
    public static void main(String[] args) {
        boolean[][] visited = new boolean[4][5];

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                System.out.println(visited[i][j]);
            }
        }

        int n = 35, m = 37;
        int sum = 0;
        while (m != 0) {
            sum += m % 10;
            m /= 10;
        }
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
