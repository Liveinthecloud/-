package 选择排序;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] arge){
        int[] arrary={11,2,-10,5,88,4,-32};
        System.out.println("排序前："+ Arrays.toString(arrary));
        for(int i=0;i<arrary.length-1;i++){
            for(int j=i+1;j<arrary.length;j++){
                if(arrary[i]>arrary[j]){
                    arrary[i]^=arrary[j];
                    arrary[j]^=arrary[i];
                    arrary[i]^=arrary[j];
                }
            }
            System.out.println("第"+i+"排序："+ Arrays.toString(arrary));
        }
        System.out.println("排序后："+ Arrays.toString(arrary));
    }
}
