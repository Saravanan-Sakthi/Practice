package sortingalgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SortingDriver {
    public static void main(String[] args) {
        /*HashMap map = new HashMap();
        map.put(null, "Prabhu");
        map.put("saravanan", null);
        Object a= map.get("saravanan");
        System.out.println(a);
        System.out.println(map.containsKey("saravanan"));*/
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int [] array = new int[n];
       /* System.out.print("Enter the elements : ");
        for (int i=0 ; i<n ; i++){
            array[i] = scan.nextInt();
        }*/
        Random rand= new Random();
        for (int i=0 ; i<n ; i++){
            array[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        array = new InsertionSort().sort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
