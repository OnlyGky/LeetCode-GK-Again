package linkedlist.dec_2019;


//430. 扁平化多级双向链表
public class dec_09_430 {
    private Node prev = null;
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    public void dfs(Node head){
        if(head == null)
            return;
        Node next = head.next;
        if(prev != null){
            prev.next = head;
            head.prev = prev;
        }
        prev = head;
        dfs(head.child);
        head.child = null;
        dfs(next);
    }
}
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};