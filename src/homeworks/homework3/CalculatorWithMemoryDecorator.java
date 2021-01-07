package homeworks.homework3;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double lastResultValue = 0.0;
    private double memoryVariable = 0.0;
    private ICalculator calc;

    public CalculatorWithMemoryDecorator(ICalculator calc) {
        this.calc = calc;
    }

    public double operationMultiplication(double variable1, double variable2) {
        lastResultValue = calc.operationMultiplication(variable1, variable2);
        return lastResultValue;
    }

    public double operationDivision(double variable1, double variable2) {
        lastResultValue = calc.operationDivision(variable1, variable2);
        return lastResultValue;
    }

    public double operationSum(double variable1, double variable2) {
        lastResultValue = calc.operationSum(variable1, variable2);
        return lastResultValue;
    }

    public double operationDifference(double variable1, double variable2) {
        lastResultValue = calc.operationDifference(variable1, variable2);
        return lastResultValue;
    }

    public double operationModule(double variable) {
        lastResultValue = calc.operationModule(variable);
        return lastResultValue;
    }

    public double operatorNumberToDegree(double variable, int degree) {
        lastResultValue = calc.operatorNumberToDegree(variable, degree);
        return lastResultValue;
    }

    public double operatorSquareRootOfNumber(double variable) {
        lastResultValue = calc.operatorSquareRootOfNumber(variable);
        return lastResultValue;
    }

    public void saveLastResultInMemory() {
        memoryVariable = lastResultValue;
    }

    public double retrieveResultFromMemory() {
        double variable = memoryVariable;
        memoryVariable = 0.0;
        return variable;
    }

    public ICalculator getCalculator() {
        return calc;
    }
}
