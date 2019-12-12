import java.util.Scanner;

public class Tx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            if (Qnum(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean Qnum(String s) {
        if (s.length() < 11) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '8') {
                if (s.length() - i >= 11) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
