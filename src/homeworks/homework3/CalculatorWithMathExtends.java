package homeworks.homework3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public double operationModule(double variable) {
        return Math.abs(variable);
    }

    public double operatorNumberToDegree(double variable, int degree) {
        return Math.pow(variable, degree);
    }

    public double operatorSquareRootOfNumber(double variable) {
        return Math.sqrt(variable);
    }

}
