package linkedlist.dec_2019;


import linkedlist.ListNode;
//817. 链表组件
import java.util.LinkedHashSet;
import java.util.Set;

public class dec_09_817 {
    public int numComponents(ListNode head, int[] G) {
       if(G.length == 0)
           return 0;
        Set<Integer> set = new LinkedHashSet();
       for (int num : G){
           set.add(num);
       }
       int count = 0;
       while (head != null){
           if (set.contains(head.val)){
               head = head.next;
               if (head == null || !set.contains(head.val)){
                   count++;
               }
           }else {
               head = head.next;
           }
       }
       return count;
    }
}
