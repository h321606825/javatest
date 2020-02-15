public class Yanghui {
    public static void main(String[] args) {
//        // 创建二维数组
//        int t[][]=new int[5][];
//        // 遍历二维数组的第一层
//        for (int i = 0; i < t.length; i++) {
//            // 初始化第二层数组的大小
//            t[i]=new int[i+1];
//            // 遍历第二层数组
//            for(int j=0;j<=i;j++){
//                // 将两侧的数组元素赋值为1
//                if(i==0||j==0||j==i){
//                    t[i][j]=1;
//                }else{
//                    // 其他数值通过公式计算
//                    t[i][j]=t[i-1][j]+t[i-1][j-1];
//                }
//                // 输出数组元素
//                System.out.print(t[i][j]+"\t");
//            }
            //换行
//            System.out.println();
//        }

        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++){
            arr[i][i]=1;
            arr[i][0]=1;
        }
        for(int i=2;i<5;i++){
            for(int j=1;j<=i-1;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}