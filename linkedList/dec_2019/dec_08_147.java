package linkedlist.dec_2019;

import linkedlist.ListNode;
//147. 对链表进行插入排序
public class dec_08_147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = new ListNode(0), pre;
        temp.next = head;
        while(head != null && head.next != null){
            if(head.val < head.next.val){
                head = head.next;
                continue;
            }
            pre = temp;
            while(pre.next.val < head.next.val) pre = pre.next;
            ListNode cur = head.next;
            head.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
        }
        return temp.next;
    }
}
