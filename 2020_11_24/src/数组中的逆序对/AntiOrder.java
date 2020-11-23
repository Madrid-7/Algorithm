package 数组中的逆序对;

public class AntiOrder {
    public int count(int[] A, int n) {
// write code here
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}