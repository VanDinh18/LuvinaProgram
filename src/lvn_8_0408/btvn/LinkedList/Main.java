package lvn_8_0408.btvn.LinkedList;

public class Main {
    public static void main(String[] args) {
        DanhSach list = new DanhSach();
        list.insertAtFont(10);
        list.insertAtFont(12);
        list.insertAtBack(6);
        list.insertAndSort(13);
        list.print();
    }
}
