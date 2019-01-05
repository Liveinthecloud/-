package 线性表;

import 异常.MyArrayIndexOutOfBoundsException;

import java.util.Arrays;

/**
 * 顺序表
 * 底层采用数组
 */
public class ArrayList implements List {

    private static final int DEFAULT_LENGTH=4; //设置默认长度
    private Object [] elementData;//底层采用数组
    private  int size;             //元素个数

    public ArrayList(){
        this(DEFAULT_LENGTH);
    }

    /**
     *
     * @param initialCapacity   指定数组的初始长度
     */
    public ArrayList(int initialCapacity){
        //分配空间
        elementData=new Object[initialCapacity];
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if(index<0||index>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界:"+index);//抛出异常
        }
        return elementData[index];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
       /* for(int i=0;i<size;i++){
            if(elementData[i].equals(e)){
                return true;
            }
        }
        return false;*/
       return indexof(e)>=0;
    }

    /**
     *
     * @param e  e等于null和 表内的值为null都不能用equals方法
     * @return
     */
    @Override
    public int indexof(Object e) {
        if(e==null){
            for(int i=0;i<size;i++){
                if(elementData[i]==null){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (e.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void add(int index, Object e) {
        //如果数组满了扩容
        if(size==elementData.length){
            grow();
        }
        //移动元素
        for(int i=size;i>index;i--){
            elementData[i]=elementData[i-1];
        }
        //元素赋值 ，元素个数加一
        elementData[index]=e;
        size++;

    }

    @Override
    public void add(Object e) {
        //如果数组满了扩容
        if(size==elementData.length){
            grow();
        }
        //元素赋值 ，元素个数加一
        elementData[size++]=e;
    }

    private void grow(){
         /*
            //新建一个数组，长度是旧的1倍
            Object[] newArray=new Object[elementData.length*2];
            for(int i=0;i<size;i++){
                newArray[i]=elementData[i];
            }
            //elementData指向新数组
            elementData=newArray;
            */
         //源码增长50%
        /**
         * int oldCapacity = elementData.length;
         * int newCapacity = oldCapacity + (oldCapacity >> 1);
         */
        elementData= Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public Object remove(int index) {
        if(index>size){
            throw new MyArrayIndexOutOfBoundsException("Index: "+index + " , Size: "+size);
        }
        Object temp=elementData[index];
        for(int i=index;i<size;i++){
            elementData[i]=elementData[i+1];
        }
        elementData[--size]=null;
        return temp;

    }

    @Override
    public boolean remove(Object e) {
        if(e==null){
            for(int i=0;i<size;i++){
                if(elementData[i]==null){
                    remove(i);
                    return true;
                }
            }
        }else{
            for(int i=0;i<size;i++){
                if(e.equals(elementData[i])){
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object replace(int index, Object e) {
        Object temp=elementData[index];
        elementData[index]=e;
        return temp;
    }

    @Override
    public String toString() {
      if(size==0){return "[]";}
      StringBuilder builder=new StringBuilder("[");
      for(int i=0;i<size;i++){
          if(i!=size-1){
              builder.append(elementData[i]+",");
          }
          else{
              builder.append(elementData[i]);
          }
      }
      builder.append("]");
      return builder.toString();
    }
}
