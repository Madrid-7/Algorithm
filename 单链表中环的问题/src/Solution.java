/**
 * @author ：ZXF
 * @program: 单链表中环的问题
 * @description:
 * @date ：2021-07-15 11:31
 */

public class Solution {

//    判断是否有环
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p = head, q = head;
        while (p.next != null && p.next.next != null && q.next != null) {
            p = p.next.next;
            q = q.next;
            if (q == p) return true;
        }
        return false;
    }

//    找出环的入口点
//    当fast若与slow相遇时，slow肯定没有走遍历完链表，而fast已经在环内循环了n圈(1<=n)。假设slow走了s步，则fast走了2s步（fast步数还等于s 加上在环上多转的n圈），设环长为r，则：
//
//  2s = s + nr
//  s= nr
//
//  设整个链表长L，入口环与相遇点距离为x，起点到环入口点的距离为a。
//  a + x = nr
//  a + x = (n – 1)r +r = (n-1)r + L - a
//  a = (n-1)r + (L – a – x)
//
//     (L – a – x)为相遇点到环入口点的距离，由此可知，从链表头到环入口点等于(n-1)循环内环+相遇点到环入口点，于是我们从链表头、与相遇点分别设一个指针，每次各走一步，两个指针必定相遇，且相遇第一点为环入口点。
    public ListNode findLoopStart(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

//第3个问题，如果存在环，求环上节点的个数：
//对于这个问题，我这里有两个思路（肯定还有其它跟好的办法）：
//思路1：记录下相遇节点存入临时变量tempPtr，然后让slow(或者fast，都一样)继续向前走slow = slow -> next；一直到slow == tempPtr; 此时经过的步数就是环上节点的个数；
//思路2： 从相遇点开始slow和fast继续按照原来的方式向前走slow = slow -> next; fast = fast -> next -> next；直到二者再次项目，此时经过的步数就是环上节点的个数 。

//问题4是如果存在环，求出链表的长度：
//到这里，问题已经简单的多了，因为我们在问题1、2、3中已经做得足够的”准备工作“。
//我们可以这样求出整个链表的长度：
//链表长度L = 起点到入口点的距离 + 环的长度r;

//问题5是，求出环上距离任意一个节点最远的点（对面节点）
//对于换上任意的一个点ptr0, 我们要找到它的”对面点“，可以这样思考：同样使用上面的快慢指针的方法，让slow和fast都指向ptr0，每一步都执行与上面相同的操作（slow每次跳一步，fast每次跳两步），
//当fast = ptr0或者fast = prt0->next的时候slow所指向的节点就是ptr0的”对面节点“。

//对于问题6（扩展）如何判断两个无环链表是否相交，和7（扩展）如果相交，求出第一个相交的节点，其实就是做一个问题的转化：
//假设有连个链表listA和listB，如果两个链表都无环，并且有交点，那么我们可以让其中一个链表（不妨设是listA）的为节点连接到其头部，这样在listB中就一定会出现一个环。
//因此我们将问题6和7分别转化成了问题1和2.

}
