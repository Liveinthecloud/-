package 二叉树;

/**
 * 二叉树的接口
 */
public interface BinaryTree {
    /**
     * 是否空树
     * @return
     */
    public boolean isEmpty();

    /**
     * 树结点数量
     * @return
     */
    public int size();

    /**
     * 获取二叉树的高度
     * @return
     */
    public int getHeight();

    /**
     * 查找指定值的结点
     * @param e
     * @return
     */
    public Node findKey(Object e);

    /**
     * 前序递归遍历
     */
    public void preOrderTraverse();

    /**
     * 中序遍历递归操作
     */
    public void inOrderTraverse();

    /**
     * 后序遍历递归操作
     */
    public void postOrderTraverse();

    /**
     * 后序遍历递归操作
     * @param node 树根结点
     */
    public void postOrderTraverse(Node node);
}
