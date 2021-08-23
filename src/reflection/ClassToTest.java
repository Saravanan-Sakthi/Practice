package reflection;

public class ClassToTest {

    public String s="Saravanan";
    protected int n=25;
    float f= 23.03F;
    private String secret="hey penne...";

    ClassToTest(int n){
        System.out.println("Inside package protected constructor");
    }
    public ClassToTest(float b){
        System.out.println("Inside public constructor");
    }
    protected ClassToTest(String s){
        System.out.println("Inside protected constructor");
    }
    private ClassToTest(int n, int m){
        System.out.println("Inside private constructor");
    }

    void showHi(){
        System.out.println("Inside default");
        System.out.println("hi");
    }
    public int getValue(int n){
        System.out.println("Inside public");
        System.out.println("getValue "+n);
        return n;
    }
    protected String getMessage(String a, char c){
        System.out.println("Inside protected");
        System.out.println("getMessage "+a+c);
        return a+c;
    }
    private void privateMethod(){
        System.out.println("Inside private");
    }
}
