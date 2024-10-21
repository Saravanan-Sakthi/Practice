import bugfix.InfiniteLoop;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Abc {
    public static void main(String [] inputs){
        Object a = null;
        InfiniteLoop b = (InfiniteLoop) a;
        System.out.println(b);
    }
    private static void printBits(byte a) {
        for (int i = 128 ; i>=1 ; i/=2) {
            int and = a & i;
            if (and == 0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
        System.out.println();
    }

    private static void printBits(int a) {
        System.out.println(Integer.toBinaryString(a));
    }
}
