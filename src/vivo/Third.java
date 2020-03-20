package vivo;


import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int res = phone(n,m);
    }
    static int phone(int n,int m){
        int res = 0;
        for(int i = n;i<=m;i++){
            res+=getJiec(i);
        }
        return res;
    }
    static int getJiec(int n){
        int res = 1;
        int num = 8;
        if(n == 1){
            return 9;
        }else if(n==2){
            return 56;
        } else {
            for(;n>0;n--){
                res *=num;
                num--;
            }
        }
        return res;
    }
}
