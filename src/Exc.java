import java.text.SimpleDateFormat;
import java.util.*;

public class Exc {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        List<Integer>list = new ArrayList<Integer>();
        Vector<String>strings = new Vector<String>();
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
//        Sys();
//        Ti();
        Scanner sc = new Scanner(System.in);
        List<Integer>ll = new LinkedList<>();
        while (sc.hasNext()){
            ll.add(sc.nextInt());
        }
        Iterator iterator = ll.iterator();
        PrintRevce(iterator);
    }
    public static void Sys() {
        System.out.println(System.getProperty("user.dir"));
    }
    public static void Ti(){
        Date date = new Date();
        String currentTime = date.toString();
        SimpleDateFormat format = new SimpleDateFormat("y-m-d H:m:s");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        try {
            format.format(date);
            System.out.println(format.format(date));
            System.out.println(format2.format(date));

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(currentTime);
    }
    public static void PrintRevce(Iterator ll) {
        if (ll.hasNext()) {
            PrintRevce(ll);
        }
    }
}
