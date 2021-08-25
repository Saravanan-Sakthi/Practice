package sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SortingDriver {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int [] array = new int[n];
        System.out.print("Enter the elements : ");
        for (int i=0 ; i<n ; i++){
            array[i] = scan.nextInt();
        }
        array = new BubbleSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
