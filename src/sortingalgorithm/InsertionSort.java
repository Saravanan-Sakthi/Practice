package sortingalgorithm;

public class InsertionSort {
    public int[] sort(int [] array){
        int length = array.length;
        for (int i=1 ; i<length ;i++){
            int key = array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j=j-1;
            }
            array[j+1] = key;
        }
        return array;
    }
}
