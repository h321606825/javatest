package mianshi;

class Node {
    int data;
    Node left;
    Node right;

    public boolean empty(){
        if(this.data == 0){
            return true;
        }
        return false;
    }
}
public class SwapDouList {
    private Node data = new Node();
    public static Node fanzhuan (Node head){
        if(head.empty() || head.right == null){
            return null;
        }
        Node pre = null;
        Node next = null;
        while(head.right != null){
// 1  <-> 2 <->3
            next = head.right;
            head.right = pre;
            head.left = next;
            pre = head;
            head = next;
        }
        return head;
    }

}
