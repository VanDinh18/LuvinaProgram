package lvn_8_0408.bttl.tree;

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
    public void in(){
        InOrder(root);
    }
    private void InOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        InOrder(treeNode.leftNode);
        System.out.print(treeNode.data + " ");
        InOrder(treeNode.rightNode);
    }
    public void post(){
        PostOrder(root);
    }
    private void PostOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        PostOrder(treeNode.leftNode);
        PostOrder(treeNode.rightNode);
        System.out.print(treeNode.data + " ");
    }

    //khử đệ quy

}
