package 排序.快速排序;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] arge){
        int array[]={72,6,57,88,60,42,86,73,48,88};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array){
        int low=0;
        int high=array.length-1;
        quickSort(array,low,high);
    }
    private static void quickSort(int[] array,int low,int high){
        if(low<high){

            //分区
            int index=partition(array,low,high);
            //对左分区快排
            quickSort(array,low,index-1);
            //对右分区快排
            quickSort(array,index+1,high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        //指定左右指针
        int i=low;
        int j=high;
        //将第一个数作为基准值
        int temp=array[i];
        //用循环实现分区
        while (i<j){
            //从右向左移动j，找到第一个小于基准值的数
            while (array[j]>=temp&&i<j){
                j--;
            }
            //将找到的值填入到（空位置），左边的指针（i）向右移动i++；
            if(i<j){
                array[i]=array[j];
                i++;
            }
            //从左向右移动i，找到第一个大于基准值的数
            while(array[i]<temp&&i<j){
                i++;
            }
            //将找到的值填入到（空位置），右的指针（j）向右移动j--；
            if(i<j){
                array[j]=array[i];
                j--;
            }
        }
        // i=j  填写基准值
        array[i]=temp;
        System.out.println(Arrays.toString(array));
        //换回基准值的索引
        return i;
    }
}
