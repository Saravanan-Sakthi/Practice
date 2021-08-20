package reflection.testing;

import reflection.ClassToTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestRunner {
    public static void main(String[] args) {
        try {
            Class<ClassToTest> ref= (Class<ClassToTest>) Class.forName("reflection.ClassToTest");
            Class[] classArray= new Class[1];
            classArray[0]=int.class;
            Method[] methods=ref.getMethods();
            System.out.println(Arrays.toString(methods));
            methods= ref.getDeclaredMethods();
            System.out.println(Arrays.toString(methods));
            Field[] variables= ref.getFields();
            System.out.println(Arrays.toString(variables));
            variables = ref.getDeclaredFields();
            System.out.println(Arrays.toString(variables));
            Constructor[] constructors= ref.getDeclaredConstructors();

            for(Constructor cons:constructors){
                System.out.println(cons.toString());
                cons.setAccessible(true);

            }
            Class[]parameter=cons.getParameterTypes();
            Constructor cons= ref.getDeclaredConstructor(parameter);

            System.out.println(parameter);
            ClassToTest cls=(ClassToTest) cons.newInstance();

//
//            Constructor.setAccessible(constructors, true);
//            System.out.println(Arrays.toString(constructors));
//            Constructor con= ref.getDeclaredConstructor(ref, int.class);
//            constructors=ref.getDeclaredConstructors();
//            System.out.println(Arrays.toString(constructors));
//            ClassToTest ct= (ClassToTest) ref.newInstance();
//            ct= (ClassToTest) con.newInstance(ref,6);
//            System.out.println(ct);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
