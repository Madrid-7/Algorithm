package offer18;

/**
 * @author ：ZXF
 * @program: 2021_4_22
 * @description:
 * @date ：2021-04-22 20:13
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        ListNode q = head;

        while (p != null) {
            if (p.val == val) {
                if (p == head) {
                    return head.next;
                } else {
                    q.next = p.next;
                    return head;
                }
            } else {
                q = p;
                p = p.next;
            }
        }
        return head;
    }

    public ListNode deleteNode1(ListNode head, int val) {
        if(head == null) return head;
        ListNode cur = head;
        ListNode pre = null;
        if(cur.val == val) return head.next;
        while(cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}


