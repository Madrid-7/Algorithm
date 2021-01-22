package 链式A加B;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode c = new ListNode(-1);
        ListNode tmp = c;
        int addToNextDigit = 0;
        while (a != null || b != null || addToNextDigit != 0) {
            int num_a = a == null ? 0 : a.val;
            int num_b = b == null ? 0 : b.val;

            int sum = num_a + num_b + addToNextDigit;

            int nodeNum = sum % 10;
            addToNextDigit = sum / 10;

            ListNode node = new ListNode(nodeNum);
            tmp.next = node;
            tmp = tmp.next;

            a = a == null ? null : a.next;
            b = b == null ? null : b.next;
        }
        return c.next;
    }
}