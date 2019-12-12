public class Change {
    private static void change(StringBuffer str1,StringBuffer str2){
        str2 = str1;
        str1 = new StringBuffer("Hello OPPO");
        str2.append("Welcome");
    }

    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("OPPO");
        StringBuffer str2 = new StringBuffer("World");
        change(str1,str2);
        System.out.println(str1.toString());
        System.out.println(str2.toString());
        int a=1;
        short b =100;
        int c = 'a';
        a = 0;
        c=0;
        do{
            --c;
            a=a-1;
        }while (a>0);
        System.out.println(c);
    }
}
