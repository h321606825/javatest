import java.util.Scanner;

public class Gua1 {
    public static int first(int[] a) {
        for(int i=0;i<a.length;){
            if(a[i]>0&&a[i]<=a.length&&a[i]!=a[a[i]-1]){
                int index = a[i];
                a[i] = a[index -1];
                a[index -1]=index;
            }else{
                i++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                return i+1;
            }
        }
        return a.length+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(first(a));
    }
}
