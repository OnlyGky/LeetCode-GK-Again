package linkedlist.nov_2019;
//86. 分隔链表
public class nov_21_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode after_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after = after_head;
        while (head!= null){
            if (head.val < x){
                before.next = head;
                before = before.next;
            }else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        before.next = after_head.next;
        after.next = null;
        return before_head.next;
    }
}
