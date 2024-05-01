package calculator;

public class ModOperation implements Operator{
    @Override
    public double operate(double num1, double num2) {
        if (num2 ==0) {
            throw new IllegalArgumentException("num2에는 0이 들어갈 수 없습니다.");
        }
        return num1 % num2;
    }
}
