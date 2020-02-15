import java.util.Arrays;

public class Sort {
    static int[] insertSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > temp)
                k--;
            //腾出位置插进去,要插的位置是 k + 1;
            for (int j = i; j > k + 1; j--)
                arr[j] = arr[j - 1];
            //插进去
            arr[k + 1] = temp;
        }
        return arr;
    }

    public static int[] selectSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) min = j;
            }
            //交换
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }

    private static void QKSourt(int[] a, int start, int end) {
        if (a.length < 0){
            return ;
        }
        if (start >= end){
            return ;
        }
        int left = start;
        int right = end;
        int temp = a[left];
        while (left < right){
            while (left < right && a[right] > temp){
                right -- ;
            }
            a[left] = a[right];
            while (left < right && a[left] < temp){
                left ++ ;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        System.out.println(Arrays.toString(a));
        QKSourt(a, start, left -1);
        QKSourt(a,left+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 3, 5, 1, 6, 7, 8, 3, 4, 9};

        QKSourt(arr,0,arr.length-1);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
