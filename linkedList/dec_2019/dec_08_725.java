package linkedlist.dec_2019;

import linkedlist.ListNode;

//725. 分隔链表
public class dec_08_725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        int len = 0;
        while (cur != null){
            cur = cur.next;
            len++;
        }
        int width = len/k, rem = len%k;
        ListNode[] res = new ListNode[k];
        cur = root;
        for (int i = 0; i < k; i++){
            ListNode head = cur;
            for(int j = 0; j < width+(i < rem ? 1 : 0)-1; j++){//记得得减一
                if(cur != null) cur = cur.next;
            }
            if (cur != null){
                ListNode prev  = cur;
                cur = cur.next;
                prev.next = null;
            }
            res[i] = head;
        }
        return res;
    }
}
