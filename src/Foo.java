public class Foo {
    public static void main(String[] args) {
//        ststicFunction();
    }
    static Foo instance = new Foo();
    static {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }

        Foo(){
        System.out.println(3);
        System.out.println("a="+a+"b="+b);
    }
    public static void staticFunction(){
        System.out.println(4);
    }
    int a=10;
    static int b =11;
}
