package meituan;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char d = '.';
        char z = 'X';
        String line1 = scanner.next();
        String line2 = scanner.next();
        char[][] data = new char[2][n];
        for (int i = 0; i < n; i++) {
            data[0][i] = line1.charAt(i);
            data[1][i] = line2.charAt(i);
        }
        int count = 1;
        for (int i = 1; i < n - 1; i++) {
            // 都可以走
            if (data[0][i] == d && data[1][i] == d) {
                count = count * 2;
            }
            // 都不能走
            if (data[0][i] == z && data[1][i] == z) {
                count = 0;
                break;
            }
            // 一条路 不做操作
        }
        // 只有一列，只能向右走，没有办法
        if (n == 1) {
            System.out.println(0);
        }
        // 最后一列防止有障碍，并且不*2
        else if (data[1][n - 1] == d) {
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}
