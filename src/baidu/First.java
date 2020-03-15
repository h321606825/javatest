package baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ac
 */
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        for (int i=0;i<n;i++){
            if(m.containsKey(a[i])){
                int c = m.get(a[i]);
                m.put(a[i],c+1);
            }else {
                m.put(a[i],1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer,Integer> entry : m.entrySet()){
            int t = entry.getValue();
            int tsum = t>>1 + t%2;
            sum+=tsum;
        }
        System.out.println(sum);
    }
}
