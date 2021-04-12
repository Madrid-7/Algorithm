package 旋转数组中的最小数字;

/**
 * @author ：ZXF
 * @program: 2021_3_26
 * @description:
 * @date ：2021-03-26 13:05
 */

public class Solution {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int minArray1(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            // 只要右边比中间大，那右边一定是有序数组
            if (numbers[right] > numbers[mid]) {
                right = mid;
            } else if (numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else {
                // 去重
                right--;
            }
        }
        return numbers[left];
    }
}
