package linkedlist.nov_2019;
//2. 两数相加
public class nov_19_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = l1;
        ListNode s = l2;
        //先判断两者的长度
        int len1 = getLength(l);
        int len2 = getLength(s);
        l = l1;
        s = l2;
        //合并
        if(len1 > len2){
            merge(l,s);
            return l1;
        }else{
            merge(s,l);
            return l2;
        }
    }
    public void merge(ListNode one, ListNode two){
        ListNode root = one;
        int result = 0;
        while(root != null && two != null){
            int count = root.val + two.val + result;
            if(count >= 10 ){//判断值是否大于10
                root.val = (count % 10);
                result = 1;
            }else{
                root.val = count;
                result = 0;
            }
            root = root.next;
            two = two.next;
        }
        while(root != null && result == 1){

            if(root.val + result >= 10){
                root.val = 0;
                result = 1;
            }else{
                root.val = (root.val +1);
                result = 0;
                break;
            }
            root = root.next;
        }
        if(result == 1 && root == null ){//最后判断是否长度有变化
            root = one;
            while(root.next != null)
                root = root.next;
            root.next = new ListNode(1);
        }
    }
    int getLength(ListNode head){
        int count = 0;
        while(head!= null){
            head = head.next;
            count++;
        }
        return count;
    }


}
