package 快速排序;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] arge){
    int [] array={11,11,22,65,-45,88,132,-65,22};
    System.out.println("排序前："+Arrays.toString(array));
    sort(array,0,array.length-1);
    System.out.println("排序后："+Arrays.toString(array));
    }
    public static void sort(int [] array,int low ,int high){

        if(low==high){
            return;
        }
        ///System.out.println(Arrays.toString(array));
        int i=low;
        int j=high;
        int key=array[i];
        while (i<j) {
            while(array[j]>=key&&i<j){ //大于标准值保持在标准值的右侧 ，j-- 向下移动
                j--;
            }
            if (i<j) {
                //当小于标准值时
                array[i]^=array[j];
                array[j]^=array[i];
                array[i]^=array[j];
            }

            while (array[i]<=key&&i<j){
                i++;
            }
            if (i<j) {
                //当大于标准值时
                array[i]^=array[j];
                array[j]^=array[i];
                array[i]^=array[j];
            }
            System.out.println(Arrays.toString(array));
        }
        //左边
        sort(array,low,i-1);
        //右边
        sort(array,i+1,high);

    }
}
