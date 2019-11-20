package linkedlist.nov_2019;
//24. 两两交换链表中的节点  http://lylblog.cn/blog/4
public class nov_20_24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;

    }
}
