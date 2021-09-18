package sorting.sortingalgorithm;

import java.util.Arrays;

public class BubbleSort { // time complexity : n2       best case: n
    public int [] sort(int [] array){
        int length = array.length;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for (int i = 0; i < length-1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
