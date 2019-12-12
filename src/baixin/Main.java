package baixin;

import java.util.Scanner;

public class Main {

    public static int getJieCheng(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int getChengFan(int a, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * a;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] results = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int t = scanner.nextInt();

            if (getJieCheng(t) > getChengFan(a, t)) {
                results[i] = getJieCheng(t);
            } else {
                results[i] = getChengFan(a, t);
            }
        }

        for (int i = 0; i < results.length; i++){
            System.out.println(results[i]);
        }
    }
}
