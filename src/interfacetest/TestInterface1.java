package interfacetest;

public interface TestInterface1 {
    int i = -1;
    default void testMethod(){
        System.out.println("test interface 1");
    }
}
