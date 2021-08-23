package reflection.testing;

import reflection.ClassToTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class TestRunner {
    public static void main(String[] args) {
        try {
            Class ref= Class.forName("reflection.ClassToTest");
            Class[] classArray= new Class[1];
            classArray[0]=int.class;
            Method[] methods=ref.getMethods();
            System.out.println(Arrays.toString(methods));
            methods= ref.getDeclaredMethods();
            System.out.println(Arrays.toString(methods));
            System.out.println();
            Field[] variables= ref.getFields();
            System.out.println(Arrays.toString(variables));
            variables = ref.getDeclaredFields();
            System.out.println(Arrays.toString(variables));
            System.out.println();
            Constructor[] constructors= ref.getDeclaredConstructors();
            System.out.println(Arrays.toString(constructors));
            Class[] p={float.class};
            Object[] ar={23.5F};
            Constructor pub= ref.getDeclaredConstructor(p);
            ClassToTest ct =(ClassToTest) pub.newInstance(ar);


            Method priMet= ref.getDeclaredMethod("privateMethod", null);   //works
            priMet = ref.getDeclaredMethod("getMessage", String.class, char.class);
            priMet = ref.getDeclaredMethod("showHi",null);
            priMet=ref.getDeclaredMethod("getValue", int.class);
            priMet.setAccessible(true);
            priMet.invoke(ct, 7);


            Field var=ref.getDeclaredField("secret");
            var.setAccessible(true);
            var.set(ct,"Sandhiya");
            System.out.println(var.get(ct));


            Class <?> [] params= new Class[] {int.class, int.class};  //works
            Constructor con= ref.getDeclaredConstructor(params);
            con.setAccessible(true);
            Object[] arg= {5,7};
            ct= (ClassToTest) con.newInstance(arg);
            System.out.println(Arrays.toString(constructors));
            System.out.println();
            System.out.println(ct);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
