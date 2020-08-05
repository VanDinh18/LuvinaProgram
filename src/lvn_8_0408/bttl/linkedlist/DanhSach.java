package lvn_8_0408.bttl.linkedlist;

public class DanhSach {
    private Node first;
    private Node last;
    public DanhSach(){
        first = last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertAtFont(int item){
        if(isEmpty()){
            first = last = new Node(item);
        }
        else {
            first = new Node(item, first);
        }
    }

    public void insertAtBack(int item){
        if(isEmpty()){
            first = last = new Node(item);
        }
        else {
            last = last.next = new Node(item);
        }
    }

    public int removeFromFont(){
        if(!isEmpty()){
            
        }
        return 1;
    }

    public void print(){
        Node temp = first;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
