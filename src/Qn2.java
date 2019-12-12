import java.util.Arrays;
import java.util.Scanner;

public class Qn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] pple = new int[n];
        for (int i = 0; i < n; i++) {
            pple[i] = sc.nextInt();
        }
        Arrays.sort(pple);
        int result = 0;
        while (n > 3) {
            int less = pple[0] + 2 * pple[1] + pple[n - 1];
            if ((pple[0] + 2 * pple[1] + pple[n - 1]) > (2 * pple[0]
                    + pple[n - 2] + pple[n - 1]))
                less = 2 * pple[0] + pple[n - 2] + pple[n - 1];
            result += less;
            n -= 2;
        }

        if (n == 3) {
            result += pple[0] + pple[1] + pple[2];
        } else if (n == 2) {
            result += pple[1];
        } else {
            result += pple[0];
        }
        System.out.println(result);
    }
}