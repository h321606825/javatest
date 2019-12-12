import java.util.Scanner;

public class Pxx1 {
    public static int funa(int a){
        return a*2;
    }
    public static int funb(int a){
        return a*10+1;
    }
    public static void pri(int a,int b){

        if(a==b){
            System.out.println(1);
            return;
        }
        if(b%10 == b/10){
            System.out.println(b/10);
            return;
        }
        if(b%2 == 0){
            System.out.println(b/2);
            return;
        }
        System.out.println(-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];
        int b[] = new int[T];
        int i=0;
        for (i=0;i<T;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            pri(a[i],b[i]);
        }
    }
}
