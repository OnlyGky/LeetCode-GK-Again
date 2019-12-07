package linkedlist.dec_2019;

import linkedlist.ListNode;

//445. 两数相加 II
public class dec_07_445 {
    int count = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sizeOne = getLength(l1);
        int sizeTwo = getLength(l2);
        if (sizeOne > sizeTwo){
            l2 = headFillZero(l2, sizeOne - sizeTwo);
        }else {
            l1 = headFillZero(l1, sizeTwo -sizeOne);
        }
        mergeTwoNumbers(l1, l2);
        if(count > 0){
            ListNode temp = new ListNode(count);
            temp.next = l2;
            return temp;
        }
        return l2;
    }

    private void mergeTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.next == null && l2.next == null){
            int temp = l1.val+ l2.val+count;
            l2.val = (temp)%10;
            count = (temp)/10;
            return;
        }
        mergeTwoNumbers(l1.next, l2.next);
        int temp = l1.val+ l2.val+count;
        l2.val = (temp)%10;
        count = (temp)/10;
        return;
    }
    private ListNode headFillZero(ListNode l2, int fillNum) {
        ListNode head = l2;
        for (int i = 0; i < fillNum; i++){
            ListNode temp = head;
            head = new ListNode(0);
            head.next = temp;
        }
        return head;
    }

    public int getLength(ListNode root){
        if (root == null)
            return 0;
        int count = 0;
        ListNode temp = root;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
