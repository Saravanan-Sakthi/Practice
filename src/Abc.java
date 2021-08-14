import java.util.ArrayList;
import java.util.List;

public class Abc {
    int a= 10;
    public static void main(String [] abc){
        List<String > list = new ArrayList<>();
        list.add("saravanan");
        list.add("vishnu");
        System.out.print(list);
        modify1(list);
        System.out.print(list);
        modify2(list);
        System.out.print(list);
        modify3(list);
        System.out.print(list);
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
