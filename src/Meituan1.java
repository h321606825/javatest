import java.util.Scanner;
import java.util.Stack;

//public class Meituan1 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String str[] = s.split(" ");
            if(str.length == 1){
                if(str[0] == "true"){
                    System.out.println("true");
                }else if(str[0] == "false"){
                    System.out.println("false");
                }else
                    System.out.println("error");
            }
        }
    }*/

  //  }

public class Meituan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ps = getPostfix(s);
        System.out.println(getBooleanPostfix(ps));
    }

    private static String getPostfix(String s) {
        String[] ss = s.split(" ");
        Stack<String> op = new Stack<>();
        StringBuffer postfixStr = new StringBuffer("");
        String temp;
        for (int i = 0; i < ss.length; i++) {
            temp = ss[i];
            if (temp.equals("true") || temp.equals("false")) {
                postfixStr.append(temp + " ");
                continue;
            }

            if ("or".equals(temp)) {
                while (!op.empty()) {
                    postfixStr.append(op.pop() + " ");
                }
                op.push(temp);
                continue;
            }

            if ("and".equals(temp)) {
                while (!op.empty() && op.peek().equals("and")) {
                    postfixStr.append(op.pop() + " ");
                }
                op.push(temp);
                continue;
            }
        }
        while (!op.empty()) {
            postfixStr.append(op.pop() + " ");
        }
        return postfixStr.toString();
    }

    private static String getBooleanPostfix(String ps) {
        Stack<String> values;
        Boolean result = false;
        try {
            values = new Stack<>();
            String[] ss = ps.split(" ");
            String temp;
            for (int i = 0; i < ss.length; i++) {
                temp = ss[i];
                if (temp.equals(" ") || temp.equals("")) {
                    continue;
                }
                if (temp.equals("true") || temp.equals("false")) {
                    values.push(temp);
                } else {
                    result = getResultAndOr(temp, values.pop(), values.pop());
                    values.push(String.valueOf(result));
                }
            }
            result = Boolean.valueOf(values.pop());
            if (!values.empty()) {
                throw new Exception();
            }
        } catch (Exception e) {
            return "error";
        }
        return String.valueOf(result);
    }

    private static Boolean getResultAndOr(String op, String value1, String value2) {
        boolean result = false;
        boolean b1;
        boolean b2;
        if (value1.equals("true")) {
            b1 = true;
        } else {
            b1 = false;
        }
        if (value2.equals("true")) {
            b2 = true;
        } else {
            b2 = false;
        }

        if (op.equals("or")) {
            result = b1 || b2;
        } else {
            result = b1 && b2;
        }
        return result;
    }
}
