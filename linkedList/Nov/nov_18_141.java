package linkedlist.nov_2019;
//141. 环形链表
public class nov_18_141 {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode one = head;
        ListNode two = head.next;
        while (one != two){
            if(one.next != null)
                one = one.next;
            else return false;
            if (two.next!= null){
                if(two.next.next != null){
                    two = two.next.next;
                }else return false;
            }else return false;
        }
        return true;
    }
}
