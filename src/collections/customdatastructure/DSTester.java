package collections.customdatastructure;

import java.util.HashMap;
import java.util.Hashtable;

public class DSTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer , Integer> obj = new DoublyLinkedList<>();
        obj.add(5,6);
        obj.add(7,6);
        obj.add(3,6);
        obj.add(5,5);
        obj.add(5,8);
        obj.add(5,4);
        obj.add(3,5);
        obj.add(1,9);
        obj.printALl();
    }
}
