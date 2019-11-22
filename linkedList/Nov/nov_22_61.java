package linkedlist.nov_2019;
//61. 旋转链表
public class nov_22_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode circle = head;
        ListNode temp = null;
        int len = 0;
        while (circle.next != null){
            circle = circle.next;
            len++;
        }
        len++;
        k = k%len;
        k = len -k -1;//此处记得减一
        circle.next = head;

        while (k > 0){
            head = head.next;
            k--;
        }
        temp = head.next;
        head.next = null;
        return temp;
    }
}
