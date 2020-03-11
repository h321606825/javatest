package DefaultandProtected;


/**
 * public 和 default的区别 *同包下继承，两者都可以通过子类对象和父类对象调用，子类内也可调用
 *因为父类方法不是public所以都不能调用，子类对象可以调用protected修饰的方法
 *
 * 但是：
 * 子类对象可以在子类内调用继承来的protected方法，但是不能在其它类内调用该方法
 *
 * 也就是说protected修饰的方法可以在子类内部调用却不能在子类外部调用
 *
 *
 */
public class DefPubdif {
    protected void haha(){
        System.out.println("hahaha");
    }
    void hehe(){
        System.out.println("hehe");
    }
}
