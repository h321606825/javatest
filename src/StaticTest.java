public class StaticTest {
    public static void out(){
        TestStic test = new TestStic();
        TestStic.pri();
        System.out.println(test);
        System.out.println(42 == 42.0);
    }

    public void prid(){
        System.out.println("prid");
    }
    public static void main(String[] args) {
        StaticTest.out();
    }
}
class TestStic implements InterfaTest{
    public TestStic(){
        System.out.println("TestStic");
    }
    public static void pri(){
        System.out.println("静态Test");
    }

    @Override
    public void sou() {
        TestStic tic = new TestStic();
        TestStic y  = tic;
    }
}