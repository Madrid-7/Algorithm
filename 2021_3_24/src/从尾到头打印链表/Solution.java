package 从尾到头打印链表;

/**
 * @author ：ZXF
 * @program: 2021_3_24
 * @description:
 * @date ：2021-03-24 16:34
 */



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }

        int[] res = new int[count];

        fun(head, res, count-1);

        return res;
    }

    private void fun(ListNode node, int[] arr, int count) {
        if (node != null) {
            arr[count] = node.val;
            fun(node.next, arr, --count);
        }
    }
}
