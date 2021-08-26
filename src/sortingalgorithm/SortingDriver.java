package sortingalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingDriver {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int [] array = new int[n];
        /*System.out.print("Enter the elements : ");
        for (int i=0 ; i<n ; i++){
            array[i] = scan.nextInt();
        }*/
        Random rand= new Random();
        for (int i=0 ; i<n ; i++){
            array[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        array = new MergeSort().sort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
