public class Oppo {
    private static Oppo ourInstance = new Oppo();

    public static Oppo getInstance() {
        return ourInstance;
    }

    private Oppo() {
        System.out.println(3);
        System.out.println("a="+a+"b="+b);
    }

    public static void main(String[] args) {
        staticFunction();
    }
    static Foo instance = new Foo();
    static {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }

//    Foo(){
//        System.out.println(3);
//        System.out.println("a="+a+"b="+b);
//    }
    public static void staticFunction(){
        System.out.println(4);
    }
    int a=10;
    static int b =11;
}
