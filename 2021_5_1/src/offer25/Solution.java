package offer25;

/**
 * @author ：ZXF
 * @program: 2021_5_1
 * @description:
 * @date ：2021-05-01 21:16
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode list = new ListNode(-1);

        ListNode node = list;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
            node.next = null;
        }

        if (l1 != null) {
            node.next = l1;
        } else {
            node.next = l2;
        }

        return list.next;
    }
}
