package linkedlist.nov_2019;
//19. 删除链表的倒数第N个节点
public class nov_20_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return head.next;
        }
        while(fast != null && fast.next!= null ){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
