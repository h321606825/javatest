import java.sql.SQLOutput;
import java.util.Scanner;

public class Qn {
    public static int res(int m, int n) {
        if (m == 0) return 1;
        if (n == 0 || n == m) return 1;
        return res(m - 1, n - 1) + res(m - 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 0; i <= m; i++) {
            System.out.print(res(m, i) + " ");
        }
    }
}
