package 顺序表;

public class testArrayList {
    public static void main(String[] arge){
        java.util.ArrayList a;
        ArrayList arrayList=new ArrayList();



        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2,6);
        System.out.println(arrayList.indexof(5));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.contains(545));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        System.out.println(arrayList.replace(3,7));
        System.out.println(arrayList.toString());


    }
}
