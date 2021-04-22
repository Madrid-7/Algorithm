import java.util.Arrays;

/**
 * @author ：ZXF
 * @program: 排序
 * @description:
 * @date ：2021-04-17 22:21
 */

public class 直接插入 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 8, 5, 9, 1, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                int j;

                for (j = i-1; j >= 0; j--) {
                    if (temp < arr[j]) {
                        arr[j+1] = arr[j];
                    } else {
                        break;
                    }
                }
                // 这句要放到这里，保证最小的时候也插入第一个
                arr[j+1] = temp;
            }
        }
    }
}
