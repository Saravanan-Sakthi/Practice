import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ClassGenerator;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MethodGenerator;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Abc {
    public static void main(String [] abc){
        /*Pattern pattern= new com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern() {
            @Override
            public String toString() {
                return null;
            }

            @Override
            public Type typeCheck(SymbolTable stable) throws TypeCheckError {
                return null;
            }

            @Override
            public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

            }

            @Override
            public double getPriority() {
                return 0;
            }
        };*/
        /*List<String > list = new ArrayList<>();
        list.add("saravanan");
        list.add("vishnu");
        System.out.print(list);
        modify1(list);
        System.out.print(list);
        modify2(list);
        System.out.print(list);
        modify3(list);
        System.out.print(list);*/
       /* char a='B';
        System.out.println(a);
        char b= (char) (a-1);
        System.out.println(b);*/
        try {
        Class ref =Class.forName("collections.Taxi");
        Method[] methos = ref.getMethods();
        Class [] params =methos[1].getParameterTypes();
        for(Method p : methos){
            System.out.println(p);
        }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void modify1(List<String>list2){
        list2.add("Azhagu");
        list2.add("Vetri");
    }
    public static void modify2(List<String>list3){
        list3=new ArrayList<>();
    }
    public static void modify3(List<String>list4){
        list4=null;
    }
}
