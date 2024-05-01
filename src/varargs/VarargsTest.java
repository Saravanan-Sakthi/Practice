package varargs;

import java.util.ArrayList;

public class VarargsTest {
    public static void main(String[] args) {
        System.out.println(combineVarArgs("hello","world"));
        System.out.println(combineVarArgs(null, null));
        System.out.println(combineVarArgs());
        String [] a=null;
        System.out.println(combineVarArgs(a));
    }

    private static String combineVarArgs(String ... args) {
        StringBuilder outPut = new StringBuilder();
        for (String arg : args) {
            outPut.append(arg);
        }
        return outPut.toString();
    }
}
