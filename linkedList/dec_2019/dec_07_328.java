package linkedlist.dec_2019;

import linkedlist.ListNode;

//328. 奇偶链表
public class dec_07_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode oneEnd= head;//奇链表的尾节点
        ListNode twoEnd = head.next;//偶链表的尾节点
        ListNode twoHead = twoEnd;//偶链表的头结点
        while (twoEnd != null && twoEnd.next != null){
            oneEnd.next = twoEnd.next;
            oneEnd = oneEnd.next;
            twoEnd.next = oneEnd.next;
            twoEnd = twoEnd.next;
        }
        oneEnd.next = twoHead;
        return head;
    }
}
