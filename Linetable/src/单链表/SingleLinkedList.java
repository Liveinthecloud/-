package 单链表;

import 异常.MyArrayIndexOutOfBoundsException;
import 顺序表.List;

public class SingleLinkedList implements List {
    private Node head =new Node();//头节点，方便编程实现

    private int size;//节点个数

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if(index<0||index>size){
            throw new MyArrayIndexOutOfBoundsException("结点不存在 Size："+size+" Index："+index);
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        return temp.getData();
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {

        return indexof(e)>=0;
    }

    @Override
    public int indexof(Object e) {
        Node temp=head;//创建临时结点
        if(e==null){
            for(int i=0;i<size;i++){
                temp=temp.getNext();
                if(temp.getData()==null){
                    return i;
                }
            }
        }else{
            for(int i=0;i<size;i++){
                temp=temp.getNext();
                if(e.equals(temp.getData())){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void add(int index, Object e) {
        if(size<index||index<0){
            throw new MyArrayIndexOutOfBoundsException("结点添加异常 size: "+size+" Index: "+index);
        }
        //找到前一结点
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        //新创建一个结点
        Node newNode=new Node(e);
        //指明该插入结点的后继结点
        newNode.setNext(temp.getNext());
        //更改前驱结点
        temp.setNext(newNode);
        size++;

    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public Object remove(int index) {
        if(index>size||index<0){
            throw new MyArrayIndexOutOfBoundsException("删除错误!size: "+size+" Index: "+index);
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.getNext();
        }
        remove(temp.getData());
        return temp.getData();
    }

    @Override
    public boolean remove(Object e) {
        Node temp=head;
        if(e==null){
            for(Node i=head;i.getNext()!=null;i=i.getNext()){
                if(temp.getNext().getData()==null){
                    temp.setNext(temp.getNext().getNext());
                    size--;
                    return true;
                }
                temp=temp.getNext();
            }
        }else{
            for(Node i=head;i.getNext()!=null;i=i.getNext()){
                if(e.equals(temp.getNext().getData())){
                    temp.setNext(temp.getNext().getNext());
                    size--;
                    return true;
                }
                temp=temp.getNext();
            }
        }
        return false;
    }

    @Override
    public Object replace(int index, Object e) {
        if (index > size || index < 0) {
            throw new MyArrayIndexOutOfBoundsException("添加错误!size: " + size + " Index: " + index);
        }
        Node temp = head;
        Object object;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        object=temp.getData();
        temp.setData(e);
        return object;
    }

    @Override
    public String toString() {
        Node temp=head;
        if(size==0){return "[]";}
        StringBuilder builder=new StringBuilder("[");
        for(int i=0;i<size;i++){
            temp=temp.getNext();
            if(i!=size-1){
                builder.append(temp.getData()+",");
            }
            else{
                builder.append(temp.getData());
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
