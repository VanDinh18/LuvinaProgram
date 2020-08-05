package lvn_8_0408.bttl.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(47);
        tree.insertNode(25);
        tree.insertNode(11);
        tree.insertNode(7);
        tree.insertNode(17);
        tree.insertNode(43);
        tree.insertNode(31);
        tree.insertNode(44);
        tree.insertNode(77);
        tree.insertNode(65);
        tree.insertNode(68);
        tree.insertNode(93);
        System.out.println("pre order");
        tree.pre();
        System.out.println("\nin order");
        tree.in();
        System.out.println("\npost order");
        tree.post();
    }
}
