package linkedlist.nov_2019;
//234. 回文链表
public class nov_19_234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reserve(slow);
        while(slow != null){
            if(head.val != slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reserve(ListNode head){
        ListNode root = null;
        while(head!= null){
            ListNode temp = head.next;
            head.next = root;
            root = head;
            head = temp;
        }
        return root;
    }
}
