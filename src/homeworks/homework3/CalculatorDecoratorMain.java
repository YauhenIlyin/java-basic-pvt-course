package homeworks.homework3;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithMathExtends();
        ICalculator calc1 = new CalculatorWithMemoryDecorator(calc);
        ICalculator calc2 = new CalculatorWithCounterDecorator(calc1);
        //Task 8:
        System.out.println("Task 8: ");
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calc2.operationSum(calc2.operationSum(4.1, calc2.operationMultiplication(15, 7)), calc2.operatorNumberToDegree(calc2.operationDivision(28, 5), 2));
        System.out.print("4.1 + 15 * 7 + (28 / 5) ^ 2 = ");
        System.out.println(result);
        System.out.println("count of calculator uses: " + ((CalculatorWithCounterDecorator) calc2).getCountOperation());
        ((CalculatorWithMemoryDecorator) calc1).saveLastResultInMemory();
        System.out.println("last result of calculator in memory: " + ((CalculatorWithMemoryDecorator) calc1).retrieveResultFromMemory());
    }
}
