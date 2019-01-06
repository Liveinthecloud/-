package 单链表;


public class testSingleLinkedList {
    public static void main(String[] arge) {
        java.util.LinkedList a;
        SingleLinkedList singleLinkedList = new SingleLinkedList();


        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);
        System.out.println("查找数据位置：" + singleLinkedList.indexof(5));
        System.out.println("链表的长度： " + singleLinkedList.size());
        System.out.println("按结点查找数据：" + singleLinkedList.get(2));
        System.out.println(singleLinkedList.toString());
        singleLinkedList.add(2, null);
        System.out.println("链表的长度： " + singleLinkedList.size());
        System.out.println(singleLinkedList.toString());
        System.out.println(singleLinkedList.contains(5));
        System.out.println("删除返回删除值："+singleLinkedList.remove(2));
        System.out.println(singleLinkedList.toString());
        System.out.println(singleLinkedList.size());
        System.out.println("替换值："+singleLinkedList.replace(3, 7));
        System.out.println(singleLinkedList.toString());


    }
}
