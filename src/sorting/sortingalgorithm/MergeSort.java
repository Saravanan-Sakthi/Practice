package sorting.sortingalgorithm;

import java.util.Arrays;

public class MergeSort {    // time complexity : n log n
    public int [] sort(int [] array){
        mergeSort(array);
        return array;
    }

    private void mergeSort(int[] array) {
        int length = array.length;
        if(length<2){
            return;
        }
        int mid= length/2;
        int [] left= new int [mid];
        int [] right= new int [length-mid];

        for(int i = 0 ; i<mid ; i++){
            left[i]=array[i];
        }
        for(int i = mid ; i<length ; i++){
            right[i-mid]=array[i];
        }

        mergeSort(left);
        mergeSort(right);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right){
        int leftLength= left.length;
        int rightLength= right.length;
        int i=0 , j=0 , k=0;

        while(i<leftLength && j<rightLength){
            if(left[i]<=right[j]){
                array[k]=left[i];
                i++;
            }
            else{
                array[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<leftLength){
            array[k]=left[i];
            i++;
            k++;
        }
        while (j<rightLength){
            array[k]=right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
