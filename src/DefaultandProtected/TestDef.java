package DefaultandProtected;

public class TestDef extends DefPubdif{
    public static void main(String[] args) {
        TestDef testDef = new TestDef();
        testDef.haha();
        testDef.hehe();

        DefPubdif defPubdif = new DefPubdif();
        defPubdif.haha();
        defPubdif.hehe();
    }
    void aa(){
        haha();
        hehe();
    }
}
