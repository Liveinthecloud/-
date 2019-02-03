package 递归;

public class Test {
    public static void main(String[] arge){
        System.out.println(coun(100));
    }

    public static int coun(int i){
        if(i<0){
            return 0;
        }
        return i+coun(--i);
    }
}
