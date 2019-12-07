package linkedlist.dec_2019;

import linkedlist.ListNode;

//148. 排序链表
public class dec_03_148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;//注意这里为head

        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null){
            if(left.val < right.val){
                h.next = left;
                left = left.next;
            }else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left!= null ? left : right;
        return res.next;

    }
}
