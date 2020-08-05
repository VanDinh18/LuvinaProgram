package lvn_8_0408.bttl.linkedlist;

public class Main {
    public static void main(String[] args) {
        DanhSach list = new DanhSach();
        System.out.println(list.isEmpty());
        list.insertAtFont(10);
        list.insertAtFont(11);
        list.insertAtBack(9);
        list.print();
    }
}
