package homeworks.homework2;

import homeworks.homework2.arrays.ArraysDemonstrator;
import homeworks.homework2.arrays.ArraysDemonstrator_2_4;
import homeworks.homework2.sorts.SortingDemonstrator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static homeworks.homework2.arrays.ArraysDemonstrator.*;
import static homeworks.homework2.loops.LoopsDemonstrator.*;
import static homeworks.homework2.loops.LoopsDemonstrator.isPositiveIntegerNumber;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //разделил на блоки для удобства проверки
        //Loops:
        {
            //Task 1.1:
            System.out.println("\nLOOPS: ");
            System.out.println("\nTask 1.1.1 : ");
            System.out.println("input number plz for factorial with loop and recursion:");
            String stringValue = br.readLine();
            if (isPositiveIntegerNumber(stringValue)) {
                long n = (long) Double.parseDouble(stringValue); // для случая 19.0000
                factorialOfNumber(n);
                System.out.println("\nTask 1.1.2* : ");
                try {
                    System.out.println(" = " + factorialOfNumberWithRecursion(n, 1));
                } catch (StackOverflowError e) {
                    System.out.println("\n stack overflow with recursion...\n");
                }
            }

            //Task 1.2:
            System.out.println("\n\nTask 1.2 : ");
            System.out.println("(Task 1.2.1, 1.2.2, 1.2.3)");
            System.out.println("input integer number > 0 plz...");
            stringValue = br.readLine();
            if (isPositiveIntegerNumber(stringValue)) {
                Long longValue = (long) Double.parseDouble(stringValue);
                productOfDigits(longValue, longValue.toString().length());//Long необходим, чтобы длина была корректной для случая 123.00
            }

            //Task 1.3:
            System.out.println("\n\nTask 1.3 : ");
            System.out.println("input number and degree of number (positive and integer):");
            double number = Double.parseDouble(br.readLine());
            stringValue = br.readLine();
            if (isPositiveIntegerNumber(stringValue)) {
                int degreeOfNumber = (int) Double.parseDouble(stringValue); //23.000 по своей сути целое число
                productOfDegreeOfNumber(number, degreeOfNumber);
            }

            //1.4*
            System.out.println("\n\nTask 1.4* : ");
            System.out.println("3 :");
            longOverflow(3);
            System.out.println("188 :");
            longOverflow(188);
            System.out.println("-19 :");
            longOverflow(-19);

            //Task 1.5:
            System.out.println("\n\nTask 1.5 : ");
            System.out.println("multiplication table:");
            multiplicationTable();
        }
        //Arrays:
        {
            System.out.println("\nARRAYS: ");
            //по условию задачи решение должно находиться в отдельных классах
            //стартовой точкой является метод "void main(String[] args)" класса "ArraysDemonstrator"
            //Tasks 2.1 2.2 2.3 :
            ArraysDemonstrator.main(args);
            //Task 2.4 :
            ArraysDemonstrator_2_4.main(args);
        }
        //Sorting
        {
            System.out.println("Sorting: ");
            //Task 3
            System.out.println("\nTask 3: homework2/diagrams/");

            //Task 4
            System.out.println("Task 4: ");
            SortingDemonstrator.main(args);
        }
        br.close();
    }


}
