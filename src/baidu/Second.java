package baidu;

import java.util.Scanner;
/*
60%
 */
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(sou(n,k));
    }
    public static int sou(long n,int k){
        if(n<=k ){
            return 1;
        }
        long l;
        long r = (n+k)/2;
        l = n-r;
        if(n - 2*l <k || n - 2*l >k){
            return 1;
        }
        if(n%k ==0){
        }else {
            return 1;
        }
        return sou(l,k)+sou(r,k);
    }
}
