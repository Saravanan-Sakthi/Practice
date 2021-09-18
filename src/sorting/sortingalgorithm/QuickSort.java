package sorting.sortingalgorithm;

import java.util.Arrays;

public class QuickSort {  // time complexity : n log n            worst case : n2
    public int[] sort(int [] array){
        quickSort(array, 0, array.length-1);
        return array;
    }

    private void quickSort(int [] array, int low, int high){
        if(low<high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private int partition(int [] array, int low, int high){
        int pivot= array[high];
        int i= low-1;
        for (int j=low; j<= high ; j++){
            if(array[j]<pivot){
                i++;
                if(i !=j){  // swap
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        if(i+1 != high) {  //swap
            array[i + 1] = array[i + 1] + array[high];
            array[high] = array[i + 1] - array[high];
            array[i + 1] = array[i + 1] - array[high];
        }
        System.out.println(Arrays.toString(array));
        return i+1;
    }
}
