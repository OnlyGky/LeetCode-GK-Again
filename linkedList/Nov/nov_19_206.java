package linkedlist.nov_2019;
//206. 反转链表
public class nov_19_206 {
    public ListNode reverseList(ListNode head) {
        if(head== null)
            return head;
        ListNode root = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = root;
            root = head;
            head = temp;
        }
        return root;
    }
}
