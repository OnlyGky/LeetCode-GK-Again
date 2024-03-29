package linkedlist.dec_2019;
//707. 设计链表
public class dec_10_707 {
    private class Node{
        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }
    }
    private Node dummyHead;
    int size;

    public dec_10_707() {
        dummyHead = new Node(-1);
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        Node curr = dummyHead.next;
        for(int i = 0; i < index; i++)
            curr = curr.next;
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size)
            return;
        if(index < 0)
            addAtHead(val);
        Node prev = dummyHead;
        for(int i = 0; i < index; i++){
            prev = prev.next;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;
        Node prev = dummyHead;
        for(int i = 0; i < index; i++)
            prev = prev.next;
        Node reNode = prev.next;
        prev.next = reNode.next;
        reNode.next = null;
        size--;
    }
}
