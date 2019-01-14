package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {
    private Node root;//根结点

    public LinkedBinaryTree() {
        super();
    }


    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        System.out.println("二叉树结点个数：");
        return this.size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            //获取左子树的size
            int nL = this.size(root.getLeftChild());
            //获取右子树的size
            int nR = this.size(root.getRightChild());
            //返回左右子树的数量
            return nL + nR + 1;
        }
    }

    @Override
    public int getHeight() {
        System.out.println("二叉树的高度：");
        return this.getHeight(root);
    }

    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            //获取左子树的高度
            int nL = this.getHeight(root.getLeftChild());
            //获取右子树的高度
            int nR = this.getHeight(root.getRightChild());
            //返回左右子树较大高度并加一
            return nR > nL ? nR + 1 : nL + 1;
        }
    }

    @Override
    public Node findKey(Object e) {
        System.out.println("查找值：");
        return this.findKey(e, root);
    }

    private Node findKey(Object e, Node root) {
        //结点为空，可能是整个树的根结点，也可能是递归调用中叶子结点的左孩子和右孩子
        if (root == null) {
            return null;
        } else if (root != null && root.getValue() == e) {//找到指定元素返回结点
            return root;
        } else {
            Node nodeL = this.findKey(e, root.getLeftChild());
            Node nodeR = this.findKey(e, root.getRightChild());
            if (nodeL != null && nodeL.getValue() == e) {
                return nodeL;
            } else if (nodeR != null && nodeR.getValue() == e) {
                return nodeR;
            } else {
                return null;
            }
        }
    }

    @Override
    public void preOrderTraverse() {
        //输出根结点的值
        if (root != null) {
            System.out.print(root.getValue() + "  ");
            //对左子树进行先序遍历
            BinaryTree leftTree = new LinkedBinaryTree(root.getLeftChild());
            leftTree.preOrderTraverse();
            //对右子树进行先序遍历
            BinaryTree rightTree = new LinkedBinaryTree(root.getRightChild());
            rightTree.preOrderTraverse();
        }

    }

    @Override
    public void inOrderTraverse() {
        System.out.println("\n中序遍历递归: ");
        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node root) {
        if (root != null) {
            //遍历左子树
            this.inOrderTraverse(root.getLeftChild());
            //输出根的值
            System.out.print(root.getValue() + "  ");
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
        if (root != null) {
            //左子树遍历
            postOrderTraverse(root.getLeftChild());
            //右子树遍历
            postOrderTraverse(root.getRightChild());
            //输出根节点值
            System.out.print(root.getValue() + "   ");
        }
    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {
        System.out.println("层次遍历树：");
        if (root==null){return;}
        Queue<Node> queue=new LinkedList<>();//创建队列
        queue.add(root);//放入根结点
        while(queue.size()!=0){
            int len=queue.size();
            for(int i=0;i<len;i++){
                Node temp=queue.poll();//出队列
                System.out.print(temp.getValue()+" ");
                //把结点的左右孩子入队列（先左在右）
                if(temp.getLeftChild()!=null){queue.add(temp.getLeftChild());}
                if(temp.getRightChild()!=null){queue.add(temp.getRightChild());}
            }
        }
        System.out.println();
    }
}
