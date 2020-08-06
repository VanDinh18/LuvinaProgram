package lvn_8_0408.btvn.Tree;

public class Tree {

    TreeNode root;

    public Tree(){
        root = null;
    }

    public void insertNode(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }
    public void pre(){
        PreOrder(root);
    }
    private void PreOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        System.out.print(treeNode.data + " ");
        PreOrder(treeNode.leftNode);
        PreOrder(treeNode.rightNode);
    }
}
