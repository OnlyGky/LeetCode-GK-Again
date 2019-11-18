package linkedlist.nov_2019;
// 83. 删除排序链表中的重复元素
public class nov_18_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode root = head;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                ListNode temp = head.next;
                while (temp != null && temp.val == head.val){
                    temp = temp.next;
                }
                head.next = temp;
                head = head.next;
            }
            else head = head.next;
        }
        return root;
    }
}
