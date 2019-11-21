package linkedlist.nov_2019;

//82. 删除排序链表中的重复元素 II
public class nov_21_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode node = new ListNode(0);
        ListNode temp = node;
        node.next = head;
        while(head!= null && head.next != null){
            if(head.val == head.next.val){
                int value = head.val;
                while(head!= null && head.val == value){
                    head = head.next;
                }
                temp.next = head;
            }else{
                head = head.next;
                temp = temp.next;
            }
        }
        return node.next;
    }
}
