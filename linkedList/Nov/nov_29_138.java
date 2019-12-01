package linkedlist.nov_2019;
//138. 复制带随机指针的链表
public class nov_29_138 {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        CloneNode(head);
        ConnectNode(head);
        return FindNode(head);
    }
    public void CloneNode(Node head){
        Node node = head;
        while(node != null){
            Node temp = new Node(node.val);
            temp.next = node.next;
            temp.random = null;
            node.next = temp;
            node = temp.next;
        }
    }
    public void ConnectNode(Node head){
        Node node = head;
        while(node!=null){
            Node temp = node.next;
            if(node.random != null)
                temp.random = node.random.next;
            node = temp.next;
        }
    }
    public Node FindNode(Node head){
        Node pNode = head;
        Node cloneHead = null;
        Node cloneNode = null;
        if(pNode!=null){
            cloneHead = cloneNode = pNode.next;
            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }
        while(pNode!=null){
            cloneNode.next = pNode.next;
            cloneNode = pNode.next;

            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }
        return cloneHead;
    }
}
