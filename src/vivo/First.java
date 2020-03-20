package vivo;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(n>0){
            n = n-i;
            if(n>0){
                sum+=i*i;
            }else {
                sum+=(i+n)*i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
