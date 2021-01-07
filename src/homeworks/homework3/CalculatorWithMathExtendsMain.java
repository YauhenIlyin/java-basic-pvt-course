package homeworks.homework3;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {
        //Task 4:
        System.out.println("Task 4: ");
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double result = calc.operationSum(calc.operationSum(4.1, calc.operationMultiplication(15, 7)), calc.operatorNumberToDegree(calc.operationDivision(28, 5), 2));
        System.out.print("4.1 + 15 * 7 + (28 / 5) ^ 2 = ");
        System.out.println(result);
    }
}
