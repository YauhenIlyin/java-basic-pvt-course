package homeworks.homework3;

public class CalculatorWithMathCopy extends Calculator implements ICalculator {

    public double operationMultiplication(double variable1, double variable2) {
        return variable1 * variable2;
    }

    public double operationDivision(double variable1, double variable2) {
        return variable1 / variable2;
    }

    public double operationSum(double variable1, double variable2) {
        return variable1 + variable2;
    }

    public double operationDifference(double variable1, double variable2) {
        return variable1 - variable2;
    }

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
