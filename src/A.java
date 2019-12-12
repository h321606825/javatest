public class A {
    public static void main(String[] args) {
        AA ab= new B();
        ab =new B();
        String s = "hello";
        String t ="hel" + "lo";
        String e = new String("hello");
//        char c[] = {"h","e","l","l","o"};
        System.out.println(s==e);
        System.out.println(s==t);
        System.out.println(Integer.toBinaryString(73));
        System.out.println(74 ^ 73);
    }

}
class B extends AA{
    static {
        System.out.println("B1");
    }
    public B(){
        System.out.println("B2");
    }
}

class AA{
    static {
        System.out.println("A1");
    }
    public AA(){
        System.out.println("A2");
    }
}