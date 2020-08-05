package lvn_8_0408.bttl.linkedlist;

public class Node {
    int data;
    Node next;

    public Node(int value){
        data = value;
        next = null;
    }
     public Node(int value, Node node){
        data = value;
        next = node;
     }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
