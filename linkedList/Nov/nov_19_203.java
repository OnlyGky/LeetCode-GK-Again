package linkedlist.nov_2019;
//203. 移除链表元素
public class nov_19_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode temp = node;
        while(node != null && node.next!= null){
            if(node.next.val == val)
                node.next = node.next.next;
            node = node.next;
        }
        return temp.next;
    }
}
