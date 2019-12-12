import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xc2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        if(expr==null||expr.length()==0)
            return null;
        char chs[]=expr.toCharArray();
        char res[]=new char[chs.length];
        Stack<Character> stack=new Stack<Character>();
        Stack<Character> s = new Stack<Character>();
        int i=0;
        int j=0;
        String left="(";
        String right=")";
        while(i<chs.length)
        {
            if(left.contains(chs[i]+""))
            {
                stack.push(chs[i]);
            } else if(right.contains(chs[i]+"")){
                stack.pop();
                while (!s.empty())
                    res[j++] = s.pop();
            } else
                {
                    s.push(chs[i]);
                    if(stack.empty()){
                        return null;
                    }
            }
            i++;
        }
        res[j] = '\0';
        String b = new String(res);
        return b;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
