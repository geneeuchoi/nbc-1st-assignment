package calculator;

public class ModOperator extends Operator{
    @Override
    public double operate(double num1, double num2) {
        if (num2 ==0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 % num2;
    }
}
