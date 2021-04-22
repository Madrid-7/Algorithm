import java.util.Arrays;

/**
 * @author ：ZXF
 * @program: 排序
 * @description:
 * @date ：2021-04-17 22:47
 */

public class 归并 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int left, int right) {
        int middle = (left + right)/2;
        if (left < right) {
            // 处理左边
            mergeSort(arr, left, middle);
            // 处理右边
            mergeSort(arr, middle+1, right);
            // 归并
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {

    }
}
