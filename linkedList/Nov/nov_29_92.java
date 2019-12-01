package linkedlist.nov_2019;
//92. 反转链表 II
public class nov_29_92 {

        public ListNode reverseBetween(ListNode head, int m, int n) {
            int count = 0;
            ListNode end = new ListNode(0);
            end.next = head;
            ListNode root = end;
            while (root != null){
                if(count == m-1){//遍历到目标值的上一个值
                    ListNode node = root.next;
                    ListNode last = null;//反转后链表的头结点
                    ListNode temp = null;//n位置元素的下一个节点
                    while (count != n && node != null){//头插
                        temp = node.next;
                        node.next = last;
                        last = node;
                        node = temp;
                        count++;
                    }
                    root.next = last;
                    while(root.next != null&&root.next != temp)//拼接
                        root = root.next;
                    root.next = temp;
                    break;
                }else {
                    root = root.next;
                    count++;
                }
            }
            return end.next;
    }
}
