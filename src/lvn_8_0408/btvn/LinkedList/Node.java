package lvn_8_0408.btvn.LinkedList;

public class Node {
    int data;
    Node next;

    public Node(){}
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