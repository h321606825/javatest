public class ObjecctTest implements Cloneable{
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjecctTest) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjecctTest test1 = new ObjecctTest();
        ObjecctTest test2 = new ObjecctTest();

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        //false
        //重写equals方法后，test1 equals test2返回true
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test1));//true
        System.out.println(test1.toString());//ObjecctTest

        //说明clone方法返回的是Object类的引用
        System.out.println(test1.clone().hashCode());
        System.out.println(test1.clone() instanceof Object);
        //instanceof 会尝试去转化类，转化成功，返回转化后的对象。clone返回的是ObjectTest的引用对象
    }
}
