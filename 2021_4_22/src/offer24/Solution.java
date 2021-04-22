package offer24;

/**
 * @author ：ZXF
 * @program: 2021_4_22
 * @description:
 * @date ：2021-04-22 22:14
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode q = head;
        ListNode next = null;
        while (q != null) {
            next = q.next;
            q.next = p;
            p = q;
            q = next;
        }
        return p;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return node;
    }
}
