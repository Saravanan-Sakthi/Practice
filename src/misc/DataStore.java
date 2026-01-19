package misc;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private List<String> store = new ArrayList<>();
    public void addToStore(String data) {
        store.add(data);
    }


    public void dumpStore() {
        System.out.println(store);
    }
}
