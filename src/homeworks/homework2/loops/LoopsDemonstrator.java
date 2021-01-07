package homeworks.homework2.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsDemonstrator {

    public static long factorialOfNumber(long n) {
        long productOfNumbers = 1;
        System.out.print(1);
        for (long i = 2; i <= n; i++) {
            System.out.print(" * " + i);
            productOfNumbers = productOfNumbers * i;
            if (productOfNumbers < 0) {
                System.out.println("\n factorial overflow with loop...\n");
                return 0;
            }
        }
        System.out.println(" = " + productOfNumbers);
        return productOfNumbers;
    }

    public static long factorialOfNumberWithRecursion(long n, long positionOfNumber) throws StackOverflowError {
        System.out.print(positionOfNumber);
        if (n > 1) {
            System.out.print(" * ");
            return n * factorialOfNumberWithRecursion(n - 1, ++positionOfNumber);
        } else {
            return 1;
        }
    }

    public static void productOfDigits(long variable, int length) {
        if (length == 1) {
            System.out.println(variable + " = " + variable);
        } else {
            long product;
            long tenCount = 1;
            for (int i = 1; i < length; i++) {
                tenCount = tenCount * 10;
            }
            product = variable / tenCount;
            variable = variable % tenCount;
            tenCount /= 10;
            System.out.print(product);
            while (variable != 0) {
                System.out.print(" * ");
                product = product * (variable / tenCount);
                System.out.print(variable / tenCount);
                variable = variable % tenCount;
                tenCount /= 10;

            }
            System.out.println(" = " + product);
        }
    }

    public static void productOfDegreeOfNumber(double number, int degreeOfNumber) {
        double product = number;
        for (int n = 1; n < degreeOfNumber; n++) {
            product = product * number;
        }
        System.out.println(number + " ^ " + degreeOfNumber + " = " + product);
    }

    public static void longOverflow(long var) {
        long a = 1;
        long lastVariable;
        if (var > 0) {
            while (a > 0) {
                lastVariable = a;
                a = a * var;
                if (a < 0) {
                    System.out.println(" before overflow: " + lastVariable);
                    System.out.println(" after overflow: " + a);
                }
            }
        } else {
            long positiveVar = -1 * var;
            if (var < 0) {
                while (true) {
                    lastVariable = a;
                    if (a > 0) {
                        if (a * positiveVar < 0) {
                            System.out.println(" before overflow: " + lastVariable);
                            System.out.println(" after overflow: " + a * var);
                            break;
                        }
                    } else if (a < 0) {
                        if (a * var < 0) {
                            System.out.println(" before overflow: " + lastVariable);
                            System.out.println(" after overflow: " + a * var);
                            break;
                        }
                    }
                    a = a * var;
                }
            }
        }
    }

    public static void multiplicationTable() {
        for (int a = 2; a <= 6; a = a + 4) {
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                for (int rowCounter = 1, b = a; rowCounter <= 4; rowCounter++, b++) {
                    System.out.print(b + " x " + i + " = " + b * i);
                    if (i == 10) {
                        System.out.print(" ");
                    } else if ((b * i) / 10 == 0) {
                        System.out.print("   ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static boolean isPositiveIntegerNumber(String stringValue) throws IOException {
        boolean notHaveMoreThenOnePoint = true, notHaveCharacter = true;
        int countOfPoints = 0;
        char[] charArrayOfStringValue = stringValue.toCharArray();
        for (int i = 0; notHaveCharacter && notHaveMoreThenOnePoint && i < charArrayOfStringValue.length; i++) { //проверяем на наличие нескольких '.' или букв
            if (charArrayOfStringValue[i] < 48 || charArrayOfStringValue[i] > 57) {
                if (charArrayOfStringValue[i] == 46) {
                    countOfPoints++;
                    if (countOfPoints >= 2) {
                        notHaveMoreThenOnePoint = false;
                    }
                } else {
                    notHaveCharacter = false;
                }
            }
        }
        if (!notHaveCharacter || !notHaveMoreThenOnePoint) {
            System.out.println("Введено не число или оно < 0\n");
            return false;
        } else {
            Double variable = Double.parseDouble(stringValue);
            if (variable * 10 % 10 == 0 && variable > 0) { //проверяем положительное ли число и вариант "24.0"
                return true;
            } else {
                System.out.println("Введено не целое число или оно < 0\n");
                return false;
            }
        }
    }
}
