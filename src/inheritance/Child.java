package inheritance;

import inheritance.Parent;

public class Child extends Parent {

    static {
        System.out.println("Child static");
    }

    public Child() {
        super(1);
        //System.out.println("child");
    }

    public void privateTest() {

    }

//    public void testMethod() {
//        System.out.println("child");
//    }

        public void testMethod1() {
        System.out.println("child");
    }

    public void printMessage(){
        System.out.println("Inside Child");
    }
}
