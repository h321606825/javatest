

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        in.nextLine();
        String string = in.nextLine();
        char[] a = string.toCharArray();
        int i = 1;
        int num = 0;
        while (i < a.length) {
            num=0;
            if (a[i] == a[0]) {
                int v = i;
                int j = 0;
                while (v < a.length && a[v] == a[j]) {
                    num++;
                    v++;
                    j++;
                }
                if (v == a.length - 1) {
                    break;
                }
            }
            i++;
        }
        System.out.print(string);
        for (int y = 0; y < t - 1; y++) {
            System.out.print(String.valueOf(a, num, n - num));
        }
    }
}