package homeworks.homework3;

public class CalculatorWithOperator extends Calculator implements ICalculator {

    public CalculatorWithOperator() {

    }

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
        if (variable < 0) {
            variable *= -1;
        }
        return variable;
    }

    public double operatorNumberToDegree(double variable, int degree) {
        if (variable < 0 || degree < 0) {
            System.out.println("variable < 0 or degree < 0. return 0");
            return 0;
        } else if (degree == 0) {
            return 1;
        } else {
            double product = variable;
            for (int i = 1; i < degree; i++) {
                product = product * variable;
            }
            return product;
        }
    }

    public double operatorSquareRootOfNumber(double variable) {
        return Math.sqrt(variable); //писать свой алгоритм очень объемно, но поразбирался как это можно сделать
    }


}
