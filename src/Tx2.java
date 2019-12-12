import java.util.Scanner;

public class Tx2 {
    public static int M =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            M+=x[i];
        }
        int lo = getMax(x,y);
        if(x[lo] == M/2){
            System.out.println(y[lo] * x[lo]);
            return;
        }
    }
    public static int  getMax(int x[],int y[])
    {
        int res =  y[0]/ x[0];
        int re = 0;
        for(int i=1;i<y.length;i++){
            if(y[i]/x[i] < res){
                re = i;
                res = y[i]/x[i];
            }
        }
        return re;
    }
}
