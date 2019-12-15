package linkedlist.dec_2019;

import linkedlist.ListNode;

import java.util.Stack;

//1019. 链表中的下一个更大节点
public class dec_10_1019 {
    public int[] nextLargerNodes(ListNode head) {
        if(head == null)
            return null;
        int len = getLength(head);
        int[] re= new int[len];
        ListNode temp = head;
        int k = 0;
        while (temp != null){
            ListNode node = temp;
            while (node.next != null && temp.val >= node.next.val){
                node = node.next;
            }
            if(node.next == null)
                temp.val = 0;
            else {
                temp.val = node.next.val;
            }
            re[k++] = temp.val;
            temp = temp.next;
        }
        return re;
    }
    int getLength(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int[] newnextLargerNodes(ListNode head){
        int []arr = new int[10000];
        int []valueArr = new int[10000];
        Stack<Integer>stack = new Stack<>();
        int value ,length = 0;
        while (head != null){
            value = head.val;
            valueArr[length] = value;
            while (!stack.isEmpty() && value > valueArr[stack.peek()]){
                arr[stack.pop()] = value;
            }
            stack.add(length);
            length++;
            head = head.next;
        }
        int[]re = new int[length];
        for (int i = 0; i < length; i++){
            re[i] = arr[i];
        }
        return re;
    }
}
