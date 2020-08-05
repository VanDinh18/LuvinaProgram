package lvn_8_0408.bttl.tree;

public class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data){
        this.data = data;
        leftNode = rightNode = null;
    }

    public void insert(int value){
        if(data > value){
            if(leftNode == null){
                leftNode = new TreeNode(value);
            }
            else {
                leftNode.insert(value);
            }
        }
        else {
            if(rightNode == null){
                rightNode = new TreeNode(value);
            }
            else {
                rightNode.insert(value);
            }
        }
    }
    //chèn phần tử khử đệ quy
    public void chen_khu_de_quy(int value){

    }
}
