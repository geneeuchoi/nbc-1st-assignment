package calculator;

public class AddOperation implements Operator {
    @Override
    public double operate(double num1, double num2) {
        return num1 + num2;
    }

}
