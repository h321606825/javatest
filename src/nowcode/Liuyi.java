package nowcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Liuyi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer[] h = new Integer[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Integer[] w = new Integer[m];
        int res=0;
        for(int i=0;i<m;i++){
            w[i] = sc.nextInt();
        }
        Comparator comparator = new MyComparator();
        Arrays.sort(h, comparator);
        Arrays.sort(w ,comparator);
        for (int i=0,j=0; i<n&&j<m; j++) {
            if(h[i] <= w[j]){
                res++;
                i++;
            }
        }
        System.out.println(res);
    }
    static class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}
