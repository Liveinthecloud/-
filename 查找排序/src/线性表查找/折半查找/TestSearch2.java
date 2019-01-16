package 线性表查找.折半查找;

/**
 * 前提：数组有序
 */
public class TestSearch2 {
    public static void main(String[] arge) {
        //给定数组（有序）
        int[] array = {11, 33, 55, 65, 78, 88, 99, 111, 333, 666};
        //查找的值
        int key = 11;
        //进行折半查找
        int index = 0;
       // index = TestSearch2.binarySearch(array, key);
        index=TestSearch2.binaryUseRecursion(array,key);
        //输出结果
        if (index == -1) {
            System.out.println("查询不存在！");
        } else {
            System.out.println(key + " 索引是 " + index);
        }
    }

    public static int binarySearch(int[] array, int key) {
        //指定 low 和 high
        int low = 0;
        int high = array.length - 1;
        //折半查找
        while (low <= high) {
            //求的mid
            int mid = (low + high) / 2;
            //判断是否等于
            if (key == array[mid])
                return mid;
            else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    //使用递归
    public static int binaryUseRecursion(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        return binaryUseRecursion(array, key, low, high);
    }

    public static int binaryUseRecursion(int[] array, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        if (key == array[mid])
            return mid;
        else if (key < array[mid])
            return binaryUseRecursion(array, key, low, mid - 1);
        else
            return binaryUseRecursion(array, key, mid + 1, high);
    }
}
