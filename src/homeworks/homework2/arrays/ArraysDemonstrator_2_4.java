package homeworks.homework2.arrays;

import java.io.IOException;

public class ArraysDemonstrator_2_4 {
    public static void main(String[] args) throws IOException {
        //2.4.1
        System.out.println(sumOfEvenPositiveNumbersOfArray(ArraysDemonstrator.arrayFromConsole()));
        //2.4.2
        System.out.println(maxOfElementWithEvenIndexOfArray(ArraysDemonstrator.arrayFromConsole()));
        //2.4.3
        elementsLessThanArithmeticMeanOfArray(ArraysDemonstrator.arrayFromConsole());
        //2.4.4
        twoMinElementsOfArray(ArraysDemonstrator.arrayFromConsole());
        //2.4.5
        compressArray(ArraysDemonstrator.arrayFromConsole(), 23, 45);
        //2.4.6
        sumOfDigitsOfArray(ArraysDemonstrator.arrayFromConsole());
    }

    public static int sumOfEvenPositiveNumbersOfArray(int[] array) {
        int sum = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] > 0) {
                    sum = sum + array[i];
                }
            }
        }
        return sum;
    }

    public static int maxOfElementWithEvenIndexOfArray(int[] array) {
        if (array.length > 2) {
            int max = array[2];
            for (int i = 2; i < array.length; i += 2) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        } else {
            System.out.println("\n array length < 2");
            return 0;
        }
    }

    public static void elementsLessThanArithmeticMeanOfArray(int[] array) {
        if (array.length > 1) {
            int arithmeticMean = 0;
            for (int i = 0; i < array.length; i++) {
                arithmeticMean = arithmeticMean + array[i];
            }
            arithmeticMean = arithmeticMean / array.length;
            System.out.println("elements < arithmeticMean: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < arithmeticMean) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void twoMinElementsOfArray(int[] array) {
        if (array.length > 1) {
            int index1 = 0, index2, min1 = array[0], min2;
            for (int i = 1; i < array.length; i++) {
                if (min1 > array[i]) {
                    min1 = array[i];
                    index1 = i;
                }
            }
            index2 = 0;
            if (index1 == 0) {
                index2 = 1;
            }
            min2 = array[index2];
            for (int i = 1; i < array.length; i++) {
                if (min2 > array[i] && index1 != i) {
                    min2 = array[i];
                    index2 = i; //не обязательно
                }
            }
            System.out.println("2 min elements = " + min1 + " " + min2);
        } else {
            System.out.println("\n array length <= 1");
        }
    }

    public static void compressArray(int[] array, int a, int b) {
        int[] newArray = new int[array.length];
        int[] newCompressedArray;
        int newIndex = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (!(array[i] >= a && array[i] <= b)) {
                    newArray[newIndex] = array[i];
                    newIndex++; //в конце получится количество, а не индекс
                }
            }
            newCompressedArray = new int[newIndex];
            System.out.println("new compress array: ");
            for (int i = 0; i < newIndex; i++) {
                newCompressedArray[i] = newArray[i];
                System.out.println(newCompressedArray[i]);
            }
        }
    }

    public static void sumOfDigitsOfArray(int[] array) {
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    array[i] = -array[i];
                }
                while (array[i] % 10 != 0) {
                    sum += array[i] % 10;
                    array[i] /= 10;
                }
            }
            System.out.println("sum of digits: " + sum);
        } else {
            System.out.println("array length = 0");
        }
    }
}
