package collections.lrucache;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache {
    Set <Integer> record;
    int size;
    public LRUCache(int size){
        this.size= size;
        this.record= new LinkedHashSet<>(size);
    }
    public void refer(Integer key){
        if(!get(key)){
            put(key);
        }
    }

    private void put(Integer key) {
        if(record.size()==this.size){
            int first = record.iterator().next();
            record.remove(first);
        }
        record.add(key);
    }

    private boolean get(Integer key) {
        if(!record.contains(key)){
            return false;
        }
        record.remove(key);
        record.add(key);
        return true;
    }

    public void display() {
        Iterator<Integer> itr = record.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
