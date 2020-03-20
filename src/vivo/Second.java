package vivo;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = mult(num);
        System.out.println(res);
    }
    static int mult(int n){
        int num = 0;
        int sum = 0;
        int l[] = new int[10];
        int point=0;
        int ssum = n;
        int i=2;
        int q = 9;
        boolean flag = false;
        while(ssum>9*q){
            i++;
            q*=9;
        }
        int res = i-1;
        while(i>0){
            for(int j=9;j>=1&&!flag;j--){
                sum = ssum;
                if(ssum%j == 0){
                    flag =true;
                    l[point++] = j;
                    ssum/=j;
                }
            }
            if(sum == ssum && ssum >=10){
                return -1;
            }
            --i;
            flag = false;
        }
        for(;res>=0;res--){
            num = num *10 +l[res];
        }
        return num;
    }

}
