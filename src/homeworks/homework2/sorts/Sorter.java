package homeworks.homework2.sorts;

public class Sorter {

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        printArray(array);
        System.out.print(" -> ");
        int length = array.length;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    int variable = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = variable;
                }
            }
            length--;
        }
        printArray(array);
        System.out.println();
        return array;
    }

    public static int[] shakerSort(int[] array) {
        int firstIndex = 0, lastIndex = array.length - 1, variable;
        boolean isSorted = false;
        printArray(array);
        System.out.print(" -> ");
        while (!isSorted) {
            isSorted = true;
            for (int i = firstIndex; i < lastIndex; i++) {
                if (array[i + 1] < array[i]) {
                    variable = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = variable;
                    isSorted = false;
                }
            }
            lastIndex--;
            for (int j = lastIndex; j > firstIndex; j--) {
                if (array[j - 1] > array[j]) {
                    variable = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = variable;
                    isSorted = false;
                }
            }
            firstIndex++;
        }
        printArray(array);
        System.out.println();
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.print("]");
    }
}
