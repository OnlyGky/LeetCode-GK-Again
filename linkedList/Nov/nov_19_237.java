package linkedlist.nov_2019;
//删除链表中的节点
public class nov_19_237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
