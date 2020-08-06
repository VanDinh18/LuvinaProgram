package lvn_8_0408.btvn.Tree;

public class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int value){
        this.data = value;
        leftNode = rightNode = null;
    }
    //khu de quy
    public void insert(int value){
        TreeNode next = this;
        int data = next.data;
        while (true){
            if(data > value){
                if(next.leftNode == null){
                    next.leftNode = new TreeNode(value);
                    break;
                }
                else {
                    next = next.leftNode;
                    data = next.data;
                }
            }
            else if(data < value){
                if(next.rightNode == null){
                    next.rightNode = new TreeNode(value);
                    break;
                }
                else {
                    next = next.rightNode;
                    data = next.data;
                }
            }
        }
    }
}
