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
        int data = this.data;
        TreeNode next = new TreeNode(data);
        while (true){
            if(data > value){
                if(next.leftNode == null){
                    leftNode = new TreeNode(value);
                    break;
                }
                else {
                    next = next.leftNode;
                }
            }
            else if(data < value){
                if(next.rightNode == null){
                    rightNode = new TreeNode(value);
                    break;
                }
                else {
                    next = next.rightNode;
                }
            }

        }
    }
}
