package homeworks.homework2.arrays;

import homeworks.homework2.loops.LoopsDemonstrator;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraysDemonstrator {

    public static void main(String[] args) throws IOException {
        //Task 2.1: "int[] arrayFromConsole()"

        //Task 2.2:
        System.out.println("\n Task 2.2: ");
        //do - while
        doWhileIteratingOfArray(arrayFromConsole());
        //while
        whileIteratingOfArray(arrayFromConsole());
        //for
        forIteratingOfArray(arrayFromConsole());
        //foreach
        foreachIteratingOfArray(arrayFromConsole());


        //2.3
        arrayRandom(5, 100);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random randomNumberGenerator = new Random();
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = randomNumberGenerator.nextInt(maxValueExclusion);
        }
        return container;
    }

    public static int[] arrayFromConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //в статик методе после закрытия br.close(); потока снова открыть нельзя.
        String stringValue;
        while (true) {
            //тут нет возможнсти создать массив размера 0, потому что метод LoopsDemonstrator.isPositiveIntegerNumber
            //для этого случая выводит сообщение. я не стал писать дополнительный метод с условием ">= 0" вместо "> 0"
            System.out.println("\n input array size (positive and integer number): ");
            stringValue = br.readLine();
            if (LoopsDemonstrator.isPositiveIntegerNumber(stringValue)) {
                break;
            } else {
                System.out.println("invalid array size");
            }
        }
        int arraySize = Integer.parseInt(stringValue);
        int container[] = new int[arraySize];
        System.out.println("input plz " + arraySize + " integer elements in array");
        for (int i = 0; i < arraySize; i++) {
            //проверять целое ли, не стал. необходим метод для проверки с учетом отрицательных значений.
            //проверяющий значения метод я продемонстрировал: LoopsDemonstrator.isPositiveIntegerNumber
            container[i] = Integer.parseInt(br.readLine());
        }
        return container;
    }

    public static void doWhileIteratingOfArray(int[] array) {
        System.out.println("\n DO WHILE");
        //2.2.1
        int index = 0;
        if (array.length > 0) {
            do {
                System.out.println("element with index " + index + " = " + array[index]);
                index++;
            } while (index < array.length);
        }
        //2.2.2
        System.out.println("\n every second element: ");
        if (array.length > 1) {
            index = 1;
            do {
                System.out.println("element with index " + index + " = " + array[index]);
                index = index + 2;
            } while (index < array.length);
        }
        //2.2.3
        System.out.println("\n all elements in reverse order:");
        if (array.length > 0) {
            index = array.length - 1;
            do {
                System.out.println("element with index " + index + " = " + array[index]);
                index--;
            } while (index >= 0);
        }
    }

    public static void whileIteratingOfArray(int[] array) {
        System.out.println("\n WHILE");
        //2.2.1
        int index = 0;
        if (array.length > 0) {
            while (index < array.length) {
                System.out.println("element with index " + index + " = " + array[index]);
                index++;
            }
        }
        //2.2.2
        System.out.println("\n every second element: ");
        if (array.length > 1) {
            index = 1;
            while (index < array.length) {
                System.out.println("element with index " + index + " = " + array[index]);
                index += 2;
            }
        }
        //2.2.3
        System.out.println("\n all elements in reverse order:");
        if (array.length > 1) {
            index = array.length - 1;
            while (index >= 0) {
                System.out.println("element with index " + index + " = " + array[index]);
                index--;
            }
        }

    }

    public static void forIteratingOfArray(int[] array) {
        System.out.println("\n FOR");
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("element with index " + i + " = " + array[i]);
            }
        }
        //2.2.2
        System.out.println("\n every second element: ");
        if (array.length > 1) {
            for (int i = 1; i < array.length; i += 2) {
                System.out.println("element with index " + i + " = " + array[i]);
            }
        }
        //2.2.3
        System.out.println("\n all elements in reverse order:");
        if (array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println("element with index " + i + " = " + array[i]);
            }
        }
    }

    public static void foreachIteratingOfArray(int[] array) {
        System.out.println("\n FOREACH");
        //2.2.1
        if (array.length > 0) {
            int index = 0;
            for (int variable : array) {
                System.out.println("element with index " + index + " = " + variable);
            }
        }
        //2.2.2
        System.out.println("\n every second element: ");
        if (array.length > 1) {
            int index = 0;
            for (int variable : array) {
                if ((index + 1) % 2 == 0) {
                    System.out.println("element with index " + index + " = " + variable);
                }
                index++;
            }
        }
        //2.2.3
        System.out.println("\n all elements in reverse order:");
        String stringRepresentation = "";
        for (int variable : array) {
            stringRepresentation = " " + variable + stringRepresentation;
        }
        System.out.println(stringRepresentation);
    }
}
