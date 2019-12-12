import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Trick1 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static boolean CheckBlackList(String userIP, String blackIP) {
        String[] networks = userIP.split("\\.");
        long networkIp = Long.parseLong(networks[0])  << 24 | Long.parseLong(networks[1])  << 16| Long.parseLong(networks[2])  << 8| Long.parseLong(networks[3]);

        int netCount = Integer.parseInt(blackIP.replaceAll(".*/", ""));
        int mk = 0xFFFFFFFF << (32 - netCount);

        String testIp = blackIP.replaceAll("/.*", "");
        String[] ips = testIp.split("\\.");
        long ip = Long.parseLong(ips[0]) << 24|
                Long.parseLong(ips[1]) << 16|
                Long.parseLong(ips[2]) << 8|
                Long.parseLong(ips[3]);

        return (networkIp & mk) == (ip & mk);
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        String _userIP;
        try {
            _userIP = in.nextLine();
        } catch (Exception e) {
            _userIP = null;
        }

        String _blackIP;
        try {
            _blackIP = in.nextLine();
        } catch (Exception e) {
            _blackIP = null;
        }

        res = CheckBlackList(_userIP, _blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
