package jichu;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Float s = new Float(0.1f);
        Float t = new Float(0.1f);
        Double u = new Double(0.1);
        System.out.println(s==t);//false
        System.out.println(s.equals(t));//true
        System.out.println(u.equals(s));//false
        System.out.println(t.equals(u));//false
        Scanner sc = new Scanner(System.in);
        System.out.println("b"+10);//b10
        System.out.println('b'+10);//108     A-Z  65-90   a-z  97- 122
    }
}
