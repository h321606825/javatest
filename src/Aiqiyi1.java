import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Aiqiyi1 {
    public static int total = 0;
    public static void swap(String[] str, int i, int j)
    {
        String temp = new String();
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void arrange (String str[], int st, int len, String bb[])
    {
        String  b[][] = new String[len*(len-1)][len];
        int k = 0;
        if (st == len - 1)
        {
            for (int i = 0; i < len; i ++)
            {
                System.out.print(str[i]+ "  ");
                b[k][i] = str[i];
            }
            System.out.println();
            total++;
        }
        else
        {
            for (int i = st; i < len; i ++)
            {
                swap(str, st, i);
                arrange(str, st + 1, len,bb);
                swap(str, st, i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        String b[] = new String[n];
        String bb[] = new String[n];
        int i=0;
        for(;i<n-1;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            b[i] = Integer.toString(i+1);
        }
        arrange(b, 0, n,bb);
        System.out.println();
    }
}
