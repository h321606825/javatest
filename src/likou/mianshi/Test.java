package likou.mianshi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        First first = new First();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(first.isUnique(s));
        Second second = new Second();
        String s1 = sc.nextLine();
        System.out.println(second.CheckPermutation(s,s1));
    }
}
