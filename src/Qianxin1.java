import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pid = Arrays.asList(3,1,5,21,10);
        List<Integer> ppid = Arrays.asList(0,3,3,1,5);
        int n=5;
        int m=5;
        for(int i=0;i<n;i++) {
            pid.add(scan.nextInt());
        }
        for(int i=0;i<m;i++) {
            ppid.add(scan.nextInt());
        }
        int target = scan.nextInt();
        Main main = new Main();
        List<Integer> list = main.killProcess(pid,ppid,3);
        System.out.println(list.size());

    }
    private static Map<Integer,List<Integer>> buildTree(List<Integer> pid, List<Integer> ppid){
        Map<Integer,List<Integer>> tree = new HashMap<>();
        Iterator<Integer> iter1 = pid.iterator();
        Iterator<Integer> iter2 = ppid.iterator();
        while(iter1.hasNext() && iter2.hasNext()) {
            int pFlag = iter1.next();
            int ppFlag = iter2.next();
            if(!tree.containsKey(ppFlag)) {
                tree.put(ppFlag, new LinkedList<>());
            }
            tree.get(ppFlag).add(pFlag);
        }
        return tree;
    }

    private void killa(Map<Integer,List<Integer>> Tree,int num,List<Integer> result) {
        result.add(num);
        if(!Tree.containsKey(num)) {
            return ;
        }
        for(int child:Tree.get(num)) {
            killa(Tree,child,result);
        }
    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int num){
        Map<Integer,List<Integer>> Tree = buildTree(pid,ppid);
        List<Integer> result = new LinkedList<>();
        killa(Tree,num,result);
        return result;
    }

}


 */