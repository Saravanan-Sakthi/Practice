package collections.customdatastructure;

public class HMTester {
    public static void main(String[] args) {
        HashMap<Integer , Integer> obj = new HashMap<>();
        obj.put(5,6);
        obj.put(1,9);
        obj.put(2,8);
        obj.put(3,7);
        obj.put(4,3);
        obj.put(5,5);
        obj.put(6,3);
        obj.put(7,1);
        obj.put(5,9);
        System.out.println(obj.get(5));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(4));
        System.out.println(obj.get(6));
        System.out.println(obj.get(7));
    }
}
