import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TCQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yum;
        Stack<Integer> stack1 =new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=0;i<10;i++){
            yum = sc.nextInt();
            insertQueue(yum,stack1);
        }
        while(!stack1.empty()){
            System.out.println(stack1.peek());
            deleteQueuq(stack1,stack2);
        }
    }
    public static boolean insertQueue(int node, Stack<Integer> stack1){
        stack1.push(node);
        return true;
    }

    public static Integer deleteQueuq(Stack<Integer> stack1,Stack<Integer> stack2){
        while(stack1.size() >1){
            Integer node = stack1.pop();
            stack2.push(node);
        }
        Integer res = stack1.pop();
        while (!stack2.empty()){
            Integer n = stack2.pop();
            stack1.push(n);
        }
        return res;
    }
}
