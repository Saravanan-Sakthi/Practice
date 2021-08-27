package sortingalgorithm;

public class SelectionSort {
    public int[] sort(int[] array){
        int length = array.length;
        for (int i=0 ; i<length ; i++){
            int min= array[i];
            int index = i;
            for (int j=i+1 ; j< length ; j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            if(i != index) {
                array[i] = array[i] + array[index];
                array[index] = array[i] - array[index];
                array[i] = array[i] - array[index];
            }
        }
        return array;
    }
}
