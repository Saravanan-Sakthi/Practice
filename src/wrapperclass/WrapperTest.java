package wrapperclass;

public class WrapperTest {
    public static void main(String[] args) {
        Object c = "abc";
        Integer a = (Integer) c;
        System.out.println(a);
        int b = a;
        System.out.println(b);
    }
}
