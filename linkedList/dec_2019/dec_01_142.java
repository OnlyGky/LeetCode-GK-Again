package linkedlist.dec_2019;

import linkedlist.*;

//142. 环形链表 II
public class dec_01_142 {
    public ListNode detectCycle(ListNode head) {
        //判断是否有环
        ListNode temp = findOne(head);
        if(temp == null)
            return null;
        //找出环的长度
        int len = countLength(temp);
        //找到起始点
        return findFirst(head, len);
    }

    private ListNode findFirst(ListNode head, int len) {
        ListNode slow = head;
        ListNode fast = head;
        while (len != 0){
            fast = fast.next;
            len--;
        }
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    private int countLength(ListNode node) {
        ListNode temp = node.next;
        int count = 1;
        while (temp != node){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode findOne(ListNode node){
        if(node == null)
            return node;
        ListNode fast = node.next;
        ListNode slow = node;
        while (fast != slow){
            if(fast != null && fast.next != null)
                fast = fast.next.next;
            else return null;
            slow = slow.next;
        }
        return fast;
    }
}
