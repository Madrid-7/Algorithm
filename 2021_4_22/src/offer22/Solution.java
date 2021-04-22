package offer22;

/**
 * @author ：ZXF
 * @program: 2021_4_22
 * @description:
 * @date ：2021-04-22 21:59
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode frontNode = head;
        ListNode behindNode = head;
        while (frontNode != null && k > 0) {
            frontNode = frontNode.next;
            k--;
        }
        while (frontNode != null) {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}
