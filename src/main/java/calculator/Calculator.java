package calculator;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    ArithmeticCalculator arithmeticCalculator;
    CircleCalculator circleCalculator;

    private final Operator addOperator;
    private final Operator subtractOperator;
    private final Operator multiplyOperator;
    private final Operator divideOperator;

    public Calculator(Operator addOperator, Operator subtractOperator, Operator multiplyOperator, Operator divideOperator) {
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }
    public abstract void removeResult(String removeTxt);
    public abstract void inquiryResults(String inquiryTxt);
    public abstract double getResult();

    public double add(double a, double b) {
        return addOperator.operate(a, b);
    }

    public double subtract(double a, double b) {
        return subtractOperator.operate(a, b);
    }

    public double multiply(double a, double b) {
        return multiplyOperator.operate(a, b);
    }

    public double divide(double a, double b) {
        return divideOperator.operate(a, b);
    }
}


