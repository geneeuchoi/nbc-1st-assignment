package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    private double result = 0;

    public ArithmeticCalculator(Queue<Double> resultQueue) {
        super(resultQueue);
    }

    public double calculate(double num1, double num2, char operator) {
        result = operatorFactory(operator).operate(num1, num2);
        return result;
    }

    private Operator operatorFactory(char operator) {
        return switch (operator){
            case '+' -> new AddOperation();
            case '-' -> new SubtractOperation();
            case '*' -> new MultiplyOperation();
            case '/' -> new DivideOperation();
            case '%' -> new ModOperation();
            default -> throw new IllegalArgumentException("올바른 선택이 아닙니다.");
        };
    }

    @Override
    public void removeResult(String removeTxt) {
        if (removeTxt.equals("remove")) {
            if (!resultQueue.isEmpty()) {
                resultQueue.poll();
            }
        }
    }

    @Override
    public void inquiryResults(String inquiryTxt) {
        if (inquiryTxt.equals("inquiry")) {
            for (Double result : resultQueue) {
                System.out.println(result);
            }
        }
    }
    @Override
    public double getResult() {
        resultQueue.add(result);
        return result;
    }
}

