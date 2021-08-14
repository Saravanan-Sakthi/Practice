package collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TestRunner {
    public static void main(String[] args) {
        TreeSet taxiSet= new TreeSet(new SortTaxi());
        Taxi a= new Taxi();
        Taxi b= new Taxi();
        Taxi c= new Taxi();
        Taxi d= new Taxi();
        Taxi e= new Taxi();
        Taxi f= new Taxi();
        a.setAvailableTime(10);
        a.setEarning(100);
        b.setAvailableTime(12);
        b.setEarning(100);
        c.setAvailableTime(10);
        c.setEarning(200);
        d.setAvailableTime(12);
        d.setEarning(200);
        e.setAvailableTime(12);
        e.setEarning(50);
        f.setAvailableTime(10);
        f.setEarning(500);
        taxiSet.add(a);
        taxiSet.add(b);
        taxiSet.add(c);
        taxiSet.add(d);
        taxiSet.add(e);
        taxiSet.add(f);
        System.out.print(taxiSet);
    }
}
