package 两两交换链表中的节点;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-02 16:08
 */

 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode first = new ListNode(-1, head);
        ListNode node = head;
        ListNode front = first;

        while (node != null && node.next != null) {
            ListNode next = node.next.next;
            node.next.next = node;
            front.next = node.next;
            node.next = next;

            front = node;
            node = node.next;
        }

        return first.next;
    }
}
