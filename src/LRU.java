import java.util.LinkedList;
import java.util.List;

public class LRU {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("sdf");
        System.out.println(list.toString().indexOf("a"));
        dd();
    }

    public static void dd(){
        System.out.println("dd");
    }
}
