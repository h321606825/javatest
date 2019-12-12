

import java.util.HashMap;
import java.util.Scanner;

public class hwl1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String str = in.nextLine();
        String[] list = str.split(" ");
        boolean[] print = new boolean[list.length];
        for (int i = 0; i < list.length; i++) {
            print[i] = true;
        }
        for (int i = 0; i < list.length; i++) {
            int t = Integer.parseInt(list[i]);
            if (t < 0) {
                t = t * -1;
            }
            list[i] = String.valueOf(t);
            if (map.containsKey(list[i])) {
                print[i] = false;
            } else {
                map.put(list[i], i);
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (print[i]) {
                System.out.print(list[i]+" ");
            }
        }
    }
}