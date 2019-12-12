public class ObjecctTest {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjecctTest) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ObjecctTest test1 = new ObjecctTest();
        ObjecctTest test2 = new ObjecctTest();

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        //false
        //重写equals方法后，test1 equals test2返回true
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test1));//true
        System.out.println(test1.toString());//ObjecctTest
    }
}
