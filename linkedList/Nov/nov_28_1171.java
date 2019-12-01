package linkedlist.nov_2019;
//1171. 从链表中删去总和值为零的连续节点
public class nov_28_1171 {
    //选择排序的思想
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode ahead = new ListNode(-1);
        ListNode h = ahead;
        h.next = head;
        ListNode q = h.next;
        while (h.next != null) {
            int sum = 0;
            while (q != null) {
                sum += q.val;
                if (sum == 0) {
                    break;
                }
                q = q.next;
            }
            if (sum == 0) {
                // h.next至q之间的的连续子链表和等于0，那么删除这段子链表，亦即将h.next和q指针都指向q.next，进入下一层循环
                q = q.next;
                h.next = q;
            } else {
                // h.next开头的所有连续子链表累加和都不等于0，那么h.next节点应该保留，并继续从h.next.next开始检测
                h = h.next;
                q = h.next;
            }
        }
        return ahead.next;

    }
}
