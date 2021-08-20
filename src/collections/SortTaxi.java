package collections;

import java.util.Comparator;

public class SortTaxi implements Comparator<Taxi> {
    @Override
    public int compare(Taxi taxi, Taxi t1) {
        if(taxi.getAvailableTime() == t1.getAvailableTime()){
            return (int) (t1.getEarning()-taxi.getEarning());
        }
        else {
            return taxi.getAvailableTime()-t1.getAvailableTime();
        }
    }
}
