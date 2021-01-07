package homeworks.homework2.sorts;

import java.util.Random;
import java.util.Scanner;

public class SortingDemonstrator {

    public static void main(String[] args) {
        //Task 4:
        System.out.println("Task 4:");
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 1, 1, 1};
        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] array4 = new int[]{};
        System.out.println("bubble sort: ");
        Sorter.bubbleSort(array1);
        Sorter.bubbleSort(array2);
        Sorter.bubbleSort(array3);
        Sorter.bubbleSort(array4);
        System.out.println("\nshaker sort: ");
        Sorter.shakerSort(new int[]{1, 2, 3, 4, 5, 6});
        Sorter.shakerSort(new int[]{1, 1, 1, 1});
        Sorter.shakerSort(new int[]{9, 1, 5, 99, 9, 9});
        Sorter.shakerSort(new int[]{});

        //Task 4.4
        System.out.println("Task 4.4: ");
        Random rd = new Random();
        int arrayLength = rd.nextInt(1000);
        if (arrayLength < 0) {
            arrayLength *= -1;
        }
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = rd.nextInt(1000);
        }
        Sorter.shakerSort(randomArray);

        //Task 4.5
        System.out.println("Task 4.5: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("input array size:");
        int arraySize = sc.nextInt();
        if (arraySize >= 0) {
            int[] customArray = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                customArray[i] = sc.nextInt();
            }
            Sorter.shakerSort(customArray);
        } else {
            System.out.println("array size < 0");
        }
        sc.close();
    }
}
