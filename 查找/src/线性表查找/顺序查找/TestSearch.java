package 线性表查找.顺序查找;

/**
 * T(n)=O(n)
 * S(n)=O(1)
 */
public class TestSearch {
    public static void main(String[] arge){
        //给定数组
        int [] scoreArr={85,55,99,88,66,98,78,90};
        //查找的数
        int score=100;
        //完成查找
        int index=-1;
        for(int i=0;i<scoreArr.length;i++){
            if(scoreArr[i]==score){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("分数不存在！");
        }else{
            //输出结果
            System.out.println("索引："+index);
        }
    }
}
