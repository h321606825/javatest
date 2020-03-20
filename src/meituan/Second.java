package meituan;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nx = sc.nextLine();
        String []b = nx.split(" ");
        int n = Integer.valueOf(b[0]);
        int x = Integer.valueOf(b[1]);
        String s = sc.nextLine();
        String []a = s.split(" ");
        int []aa = new int[n];
        for (int i=0;i<n;i++){
            aa[i] = Integer.valueOf(a[i]);
        }
        int res = zhongshu(aa,x);
        System.out.println(res);
    }
    public static int zhongshu(int []a,int x){
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for (int aa:a) {
            if(map.containsKey(aa)){
                int old = map.get(aa);
                map.replace(aa,old,map.get(aa)+1);
            }else {
                map.put(aa,1);
            }
        }
        int num = getMax(map);
        int res = map.get(num);
        for (int aa:a) {
            if(aa != num && ((aa | x) ==num)){
                res+=1;
            }
        }
        return res;
    }
    public static int getMax(Map<Integer,Integer> map){
        int key = 0;
        int val = 0;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            int keyy = Integer.valueOf(entry.getKey().toString());
             if(val < map.get(keyy)){
                 val = map.get(keyy);
                 key = keyy;
             }
        }
        return key;
    }
}
