import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BuffTest {
    public static void main(String[] args) {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = re.readLine();
            String a[] = s.split(" ");
            for(String ss:a)
                 System.out.println(ss);
            System.out.println(Arrays.toString(a));
        } catch (IOException e) {
            System.out.println("输入异常");
            e.printStackTrace();
        }
    }
}
