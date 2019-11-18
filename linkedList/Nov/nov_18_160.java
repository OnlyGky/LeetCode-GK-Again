package linkedlist.nov_2019;
//160. 相交链表
public class nov_18_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int one = getLength(headA);
        int two = getLength(headB);
        if(one > two){
          headA =  moveMax(headA, one-two);
        }else {
           headB = moveMax(headB, two-one);
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public ListNode moveMax(ListNode head,int temp){
        while (temp > 0){
            head = head.next;
            temp--;
        }
        return head;
    }
    public int getLength(ListNode root){
        ListNode temp = root;
        int len = 0;
        while (temp!= null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
