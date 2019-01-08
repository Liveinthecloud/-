package 二叉树;

public class LinkedBinaryTree implements BinaryTree{
    private Node root;//根结点

    public LinkedBinaryTree() {
        super();
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public Node findKey(Object e) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        //输出根结点的值
        if(root!=null){
            System.out.print(root.getValue()+"  ");
            //对左子树进行先序遍历
            BinaryTree leftTree=new LinkedBinaryTree(root.getLeftChild());
            leftTree.preOrderTraverse();
            //对右子树进行先序遍历
            BinaryTree rightTree=new LinkedBinaryTree(root.getRightChild());
            rightTree.preOrderTraverse();
        }

    }

    @Override
    public void inOrderTraverse() {
        System.out.println("\n中序遍历递归: ");
        inOrderTraverse(root);
        System.out.println();
    }
    private void inOrderTraverse(Node root){
        if(root!=null){
            //遍历左子树
            this.inOrderTraverse(root.getLeftChild());
            //输出根的值
            System.out.print(root.getValue()+"  ");
            //遍历右子树
            this.inOrderTraverse(root.getRightChild());
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("\n后序遍历递归: ");
        postOrderTraverse(root);
        System.out.println();
    }

    @Override
    public void postOrderTraverse(Node root) {
        if(root!=null){
            //左子树遍历
            postOrderTraverse(root.getLeftChild());
            //右子树遍历
            postOrderTraverse(root.getRightChild());
            //输出根节点值
            System.out.print(root.getValue()+"  ");
        }
    }
}
