package linkedlist.nov_2019;
//21. 合并两个有序链表
public class nov_18_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode root = null;
        if (l1.val < l2.val){
            root = new ListNode(l1.val);
            root.next = mergeTwoLists(l1.next, l2);
        }else {
            root = new ListNode(l2.val);
            root.next = mergeTwoLists(l1, l2.next);
        }
        return root;
    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

