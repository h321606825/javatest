import java.util.Scanner;

public class gua2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        System.out.println(getMax(s));
    }

    public static String getMax(String[] s){
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if(compare(s[i],s[j])){
                    String temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
        String max = "";
        for (int i = 0; i < s.length; i++) {
            max = max+s[i];
        }
        return max;
    }
    public static boolean compare(String string1, String string2) {
        int length = string1.length()+string2.length();
        String s1 = string1+string2;
        String s2 = string2+string1;
        for (int i = 0; i < length-1; i++) {
            if(Integer.parseInt(s1.substring(i, i+1))>Integer.parseInt(s2.substring(i, i+1)))
                return false;
            if(Integer.parseInt(s1.substring(i, i+1))<Integer.parseInt(s2.substring(i, i+1)))
                return true;
        }
        return false;
    }
}
