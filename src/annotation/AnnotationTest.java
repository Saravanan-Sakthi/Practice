package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationTest {

    @Retention(RetentionPolicy.RUNTIME)
    @interface testAnnotation{
        String getName();
    }

    @testAnnotation(getName = "Sandhiya")
    public static void printTest() {
        System.out.println("Inside printTest");
    }
}
