package annotation;

import java.lang.reflect.Method;

public class AnnotationTestEngine {
    public static void main(String[] args) {
        try {
            Class testClass = Class.forName("annotation.AnnotationTest");
            Method testMethod = testClass.getDeclaredMethod("printTest");
            AnnotationTest.testAnnotation testAnnotation = testMethod.getAnnotation(AnnotationTest.testAnnotation.class);
            System.out.println(testAnnotation.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
