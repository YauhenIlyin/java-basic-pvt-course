package homeworks.homework3;

public class CalculatorWithCounter {
    private long operatorCounter;
    private Calculator calc;

    public CalculatorWithCounter(CalculatorWithOperator calc) {
        this.calc = calc;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc) {
        this.calc = calc;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc) {
        this.calc = calc;
    }

    public double operationMultiplication(double variable1, double variable2) {
        operatorCounter++;
        return calc.operationMultiplication(variable1, variable2);
    }

    public double operationDivision(double variable1, double variable2) {
        operatorCounter++;
        return calc.operationDivision(variable1, variable2);
    }

    public double operationSum(double variable1, double variable2) {
        operatorCounter++;
        return calc.operationSum(variable1, variable2);
    }

    public double operationDifference(double variable1, double variable2) {
        operatorCounter++;
        return calc.operationDifference(variable1, variable2);
    }

    public double operationModule(double variable) {
        operatorCounter++;
        return calc.operationModule(variable);
    }

    public double operatorNumberToDegree(double variable, int degree) {
        operatorCounter++;
        return calc.operatorNumberToDegree(variable, degree);
    }

    public double operatorSquareRootOfNumber(double variable) {
        operatorCounter++;
        return calc.operatorSquareRootOfNumber(variable);
    }

    public long getCountOperation() {
        return operatorCounter;
    }
}
