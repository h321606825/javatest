package DefaultTest;


import DefaultandProtected.DefPubdif;

public class TestDef extends DefPubdif{
    public static void main(String[] args) {
        DefPubdif defPubdif = new DefPubdif();
        TestDef def = new TestDef();
        def.haha();
        //无法调用
//        def.hehe();
    }
}
