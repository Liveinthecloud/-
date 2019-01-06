package 顺序表;

public interface List {
    //返回线性表的大小，即元素的个数
    public int size();
    //返回线性表中序号为i的数据元素
    public Object get(int i);
    //如果线性表为空返回true，否则返回false
    public boolean isEmpty();
    //判断线性表是否包含元素e
    public boolean contains(Object e);
    //返回元素e在线性表中的序号
    public int indexof(Object e);
    //将数据元素e插入到线性表中的i号位置
    public void add(int i,Object e);
    //将数据元素e 添加到线性表末尾
    public void add(Object e);
    //删除线性表中序号为i的元素，并返回该数据元素
    public Object remove(int i);
    //删除线性表中第一个与e相同的元素
    public  boolean remove(Object e);
    //替换线性表中序号为i 的数据元素为e，返回原数据元素
    public Object replace(int i,Object e);
}
