package interfacetest;

import inheritance.Child;

public interface TestInterface {

    int i = 2;
    default void testMethod(){
        System.out.println("test interface");
    }
}
